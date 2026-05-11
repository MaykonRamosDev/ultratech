package br.com.ultratech.backend.dto;

import java.time.LocalDateTime;
import java.util.Map;

public record ErroResponse(
        LocalDateTime timestamp,
        int status,
        String erro,
        String mensagem,
        String path,
        Map<String, String> campos
) {
}
