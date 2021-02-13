package com.softtek.web.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softtek.web.app.model.Producto;

@RestController
@RequestMapping("api/producto")
public class ProductoController {

	@GetMapping(value = "/obtener")
	public List<Producto> obtenerProductos() throws JsonMappingException, RestClientException, JsonProcessingException{
		List<Producto> productos = new ArrayList<>();
		ObjectMapper mapper= new ObjectMapper();
		RestTemplate restTemplate = new RestTemplate();
		productos = Arrays.asList(mapper.readValue(restTemplate.getForObject("http://localhost:8081/api/producto", String.class), Producto[].class));

		return productos;
	}
	
}
