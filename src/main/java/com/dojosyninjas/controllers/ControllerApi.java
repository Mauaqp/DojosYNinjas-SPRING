package com.dojosyninjas.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dojosyninjas.models.Dojo;

//@RestController
//
//public class ControllerApi {
//	private final DojosService dojosService;
//	
//	public ControllerApi(DojosService dojosService) {
//		this.dojosService = dojosService;
//	}
//	@RequestMapping("/api/dojos")
//	public List<Dojo> index(){
//		return dojosService.allDojos();
//	}
//	
//	@RequestMapping(value="/api/dojos", method=RequestMethod.POST)
//	public Dojo create (@RequestParam(value="name") String name)	{
//		Dojo dojo = new Dojo(name);
//		return dojosService.createDojo(dojo);
//	}
//	
//}
