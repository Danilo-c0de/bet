package com.brendabet.bet;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brendabet.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {

}
