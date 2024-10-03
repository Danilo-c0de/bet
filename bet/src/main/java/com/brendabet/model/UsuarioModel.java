package com.brendabet.model;

import java.util.UUID;

import com.brendabet.bet.DTO.UsuarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
	
	@Entity
	@Table(name = "tb_usuario")
	public class UsuarioModel {
		
		@Id
		@GeneratedValue(strategy = GenerationType.UUID)
		private UUID id;
		
		private String aniver,cpf,email,senha;
		
		public UsuarioModel(UsuarioDTO user) {
			this.cpf = user.cpf();
			this.aniver = user.aniver();
			this.email = user.email();
			this.senha = user.senha();
		}
	}





