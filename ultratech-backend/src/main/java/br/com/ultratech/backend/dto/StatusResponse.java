package br.com.ultratech.backend.dto;

import java.time.LocalDateTime;

public record StatusResponse(
        String status,
        String aplicacao,
        LocalDateTime dataHora
) {
}
