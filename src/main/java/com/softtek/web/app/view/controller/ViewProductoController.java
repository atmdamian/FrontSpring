package com.softtek.web.app.view.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softtek.web.app.model.Producto;

@Controller
@RequestMapping("/producto")
public class ViewProductoController {
	
	@GetMapping
	public String viewRegistrar(Map<String, String> map) {
		map.put("titulo", "Producto");
		return "registrarProductos";
	}
	
	@GetMapping(value="/catalogo")
	public String viewCatalogo(Map<String, String> map) {
		map.put("titulo", "CatalogoProducto");
		return "catalogoProductos";
	}
	
}
