package com.unifametro.apirestful.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifametro.apirestful.entites.Client;
import com.unifametro.apirestful.services.ClientService;


@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@Autowired
	private ClientService service;
	
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		
			List<Client> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
}
