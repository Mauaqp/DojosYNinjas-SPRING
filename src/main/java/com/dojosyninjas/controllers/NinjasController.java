package com.dojosyninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojosyninjas.models.Ninja;
import com.dojosyninjas.services.DojosNinjasService;



@Controller
public class NinjasController {
	private final DojosNinjasService dnService;
	
	public NinjasController(DojosNinjasService dnService) {
		this.dnService = dnService;
	}
		
	@GetMapping("/ninjas/new")
	public String newNinja(	@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dnService.allDojos());
		return "new_ninja.jsp";
	}
	
	@PostMapping("/addninja")
	public String addNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if ( result.hasErrors()) {
			return "new_ninja.jsp";
		}
		else {
			dnService.createNinja(ninja);
			return "redirect:/dojos/new";
		}
	}
}
