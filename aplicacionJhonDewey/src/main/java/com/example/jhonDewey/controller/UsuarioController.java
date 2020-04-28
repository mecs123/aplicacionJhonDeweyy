package com.example.jhonDewey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.jhonDewey.entity.model.User;
import com.example.jhonDewey.service.impl.UsuarioService;

@SpringBootApplication
@RestController
@RequestMapping("/apiJhonDewey/v1")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuService;
	
	@PostMapping(value = "/saveUser")
	public String saveUser(@RequestBody User user) {
		return usuService.saveUser(user);
		
	}

	
	
}
