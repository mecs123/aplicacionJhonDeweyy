package com.example.jhonDewey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jhonDewey.entity.model.User;

public interface UsuarioRepository extends JpaRepository<User, Long> {
	

}
