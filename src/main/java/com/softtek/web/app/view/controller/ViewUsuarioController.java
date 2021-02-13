package com.softtek.web.app.view.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class ViewUsuarioController {
	
	@GetMapping
	public String viewUsuario(Map<String, String> map) {
		map.put("titulo", "registro");
		return "registrar";
	}

}
