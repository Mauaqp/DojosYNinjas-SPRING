package com.dojosyninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojosyninjas.models.Dojo;
import com.dojosyninjas.services.DojosNinjasService;

@Controller
public class DojosController {
	private final DojosNinjasService dnService;
	
	public DojosController(DojosNinjasService dnService) {
		this.dnService = dnService;
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "new_dojo.jsp";
	}
	
	@PostMapping("/addDojo")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "new_dojo.jsp";
		}
		else {
			dnService.createDojo(dojo);
			return "redirect:/dojos/new";
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dnService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return"show.jsp";
	}
}
