package com.example.jhonDewey.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.jhonDewey.entity.model.User;
import com.example.jhonDewey.repository.UsuarioRepository;

public class UsuarioServiceImpl implements UsuarioService {
	
	
	@Autowired
	private UsuarioRepository userRepository;

	@Override
	public String saveUser(User user) {
		String ObjUser=null;
		userRepository.save(user);
		ObjUser="Guardado con succsefull";
		return ObjUser;
	}
	
	

}
