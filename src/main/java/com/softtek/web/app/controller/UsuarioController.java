package com.softtek.web.app.controller;

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

import com.google.gson.Gson;
import com.softtek.web.app.model.Usuario;
import com.softtek.web.app.response.RequestStatus;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@GetMapping
	public String viewUsuario(Map<String, String> map) {
		map.put("titulo", "registro");
		return "registrar";
	}

	@PostMapping(value = "/agregar")
	public @ResponseBody ResponseEntity<?> agregarUsuario(@ModelAttribute Usuario usuario) {
		
		RestTemplate template = new RestTemplate();

		try {
			RequestStatus estatus = new Gson().fromJson(
					template.postForObject("http://localhost:8081/api/usuario/agregar", usuario, String.class),
					RequestStatus.class);
			if (estatus.getEstatus().equals("200")) {
				return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return new ResponseEntity<String>("ERROR", HttpStatus.BAD_REQUEST);

	}

}
