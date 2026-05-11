package br.com.ultratech.backend.dto;

import java.time.LocalDateTime;

public record ContatoResponse(
        Long id,
        String nome,
        String email,
        String telefone,
        String mensagem,
        LocalDateTime criadoEm
) {
}
