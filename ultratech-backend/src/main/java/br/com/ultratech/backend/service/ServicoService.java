package br.com.ultratech.backend.service;

import br.com.ultratech.backend.dto.ServicoResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    private static final List<ServicoResponse> SERVICOS = List.of(
            new ServicoResponse(1L, "Formatação de Computadores",
                    "Melhoramos o desempenho da sua máquina com instalação e configuração completa do sistema."),
            new ServicoResponse(2L, "Instalação de Câmeras",
                    "Instalação e configuração de câmeras de segurança para residências e empresas."),
            new ServicoResponse(3L, "Suporte em Sistemas",
                    "Atendimento para correção de erros, configuração de programas e suporte técnico remoto ou presencial."),
            new ServicoResponse(4L, "Manutenção e Assistência",
                    "Manutenção preventiva e corretiva para computadores, notebooks e equipamentos de tecnologia.")
    );

    public List<ServicoResponse> listar() {
        return SERVICOS;
    }
}
