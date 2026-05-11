package br.com.ultratech.backend.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ContatoRequest(
        @NotBlank(message = "O nome é obrigatório")
        @Size(max = 120, message = "O nome deve ter no máximo 120 caracteres")
        String nome,

        @NotBlank(message = "O e-mail é obrigatório")
        @Email(message = "Informe um e-mail válido")
        @Size(max = 160, message = "O e-mail deve ter no máximo 160 caracteres")
        String email,

        @NotBlank(message = "O telefone é obrigatório")
        @Size(max = 30, message = "O telefone deve ter no máximo 30 caracteres")
        String telefone,

        @NotBlank(message = "A mensagem é obrigatória")
        @Size(max = 1000, message = "A mensagem deve ter no máximo 1000 caracteres")
        String mensagem
) {
}
