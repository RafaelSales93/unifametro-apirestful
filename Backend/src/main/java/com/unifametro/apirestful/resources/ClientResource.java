package com.unifametro.apirestful.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifametro.apirestful.entites.Client;


@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		
			list.add(new Client(1L, "Rafael", "123.456.789.00", null, 1340.4));
			list.add(new Client(2L, "Miguel", "123.456.789.00", null, 1340.4));
			list.add(new Client(3L, "Matheus", "123.456.789.00", null, 1340.4));
			list.add(new Client(4L, "Auricelio", "123.456.789.00", null, 1340.4));
		
		return ResponseEntity.ok().body(list);
	}
	
}
