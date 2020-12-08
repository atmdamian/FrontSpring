package com.softtek.web.app.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping
	public String viewUsuario(Map<String, String> map) {
		map.put("titulo", "home");
		
		return "home";
	}

}
