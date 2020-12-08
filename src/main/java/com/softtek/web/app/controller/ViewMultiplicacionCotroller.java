package com.softtek.web.app.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViewMultiplicacionCotroller {

	private static Logger LOGGER = LoggerFactory.getLogger(ViewMultiplicacionCotroller.class);

	@PostMapping("/multiplicador")
	public String viewMultiplicador(Map<String, String> map) {
		LOGGER.info("Vista Multiplicador");
		map.put("titulo", "Juego de Multiplicaciones");
		return "multiplicador";
	}
}
