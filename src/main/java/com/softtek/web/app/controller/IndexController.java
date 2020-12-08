package com.softtek.web.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softtek.web.app.model.Login;
import com.softtek.web.app.model.Usuario;

@Controller
@RequestMapping("/login")
public class IndexController {
	

	@GetMapping
	public String viewIndex(Map<String, String> map) {
		map.put("titulo", "Login");
		return "index";
	}

	@PostMapping(value = "/login")
	public @ResponseBody ResponseEntity<?> login(@ModelAttribute Login login)
			throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper mapper = new ObjectMapper();
		List<Usuario> usuarios = new ArrayList<>();
		usuarios = Arrays.asList(mapper.readValue(
				restTemplate.getForObject("http://localhost:8081/api/usuario/byUsuario?usuario=" + login.getUsuario(),
						String.class),
				Usuario[].class));
		if(this.validaUsuario(login, usuarios)) {
			return new ResponseEntity<String>("/home", HttpStatus.OK);
		}
		return new ResponseEntity<String>("LOGIN INCORRECTO", HttpStatus.UNAUTHORIZED);

	}
	
	public boolean validaUsuario(Login login,List<Usuario> usuarios) {
		System.out.println(login.toString());
		return usuarios.stream()
		.anyMatch(user -> {
			if (login.getUsuario().equals(user.getUsuario()) && login.getPw().equals(user.getPw())) {
				return Boolean.TRUE;
			}
			return Boolean.FALSE;
		});
		
	}
}
