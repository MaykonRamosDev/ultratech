package br.com.ultratech.backend.controller;

import br.com.ultratech.backend.dto.StatusResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/status")
public class StatusController {

    @GetMapping
    public StatusResponse status() {
        return new StatusResponse("online", "ULTRATECH API", LocalDateTime.now());
    }
}
