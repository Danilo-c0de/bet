package com.brendabet.bet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brendabet.bet.UsuarioRepository;
import com.brendabet.bet.DTO.UsuarioDTO;
import com.brendabet.model.UsuarioModel;

@RestController
@RequestMapping("api")

public class UsuarioController {
	
	@Autowired
	UsuarioRepository repository;

	@PostMapping("/cadastrar")
	public ResponseEntity<?> SalvarUsario(@RequestBody UsuarioDTO user) {
		UsuarioModel usuario = new UsuarioModel(user);
		repository.save(usuario);
		return ResponseEntity.ok("usuario cadastrado");
	}
	
}
