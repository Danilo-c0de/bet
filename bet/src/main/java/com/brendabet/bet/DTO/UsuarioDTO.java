package com.brendabet.bet.DTO;

import java.util.UUID;

public record UsuarioDTO(UUID id, String cpf, String email, String senha, String aniver) {

}
