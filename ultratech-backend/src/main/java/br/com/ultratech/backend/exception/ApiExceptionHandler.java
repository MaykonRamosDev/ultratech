package br.com.ultratech.backend.exception;

import br.com.ultratech.backend.dto.ErroResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErroResponse> handleValidation(MethodArgumentNotValidException exception,
                                                          HttpServletRequest request) {
        Map<String, String> campos = new LinkedHashMap<>();
        exception.getBindingResult().getFieldErrors()
                .forEach(error -> campos.put(error.getField(), error.getDefaultMessage()));

        ErroResponse response = new ErroResponse(
                LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(),
                "Erro de validação",
                "Confira os campos enviados.",
                request.getRequestURI(),
                campos
        );

        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErroResponse> handleGeneric(Exception exception, HttpServletRequest request) {
        ErroResponse response = new ErroResponse(
                LocalDateTime.now(),
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Erro interno",
                "Não foi possível processar a solicitação.",
                request.getRequestURI(),
                Map.of()
        );

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }
}
