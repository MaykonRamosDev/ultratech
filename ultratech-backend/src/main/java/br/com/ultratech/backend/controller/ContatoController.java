package br.com.ultratech.backend.controller;

import br.com.ultratech.backend.dto.ContatoRequest;
import br.com.ultratech.backend.dto.ContatoResponse;
import br.com.ultratech.backend.service.ContatoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/contatos")
public class ContatoController {

    private final ContatoService contatoService;

    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContatoResponse criar(@Valid @RequestBody ContatoRequest request) {
        return contatoService.criar(request);
    }

    @GetMapping
    public List<ContatoResponse> listar() {
        return contatoService.listar();
    }
}
