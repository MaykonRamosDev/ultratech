package br.com.ultratech.backend.service;

import br.com.ultratech.backend.dto.ContatoRequest;
import br.com.ultratech.backend.dto.ContatoResponse;
import br.com.ultratech.backend.entity.Contato;
import br.com.ultratech.backend.repository.ContatoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContatoService {

    private final ContatoRepository contatoRepository;

    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    @Transactional
    public ContatoResponse criar(ContatoRequest request) {
        Contato contato = new Contato(
                request.nome().trim(),
                request.email().trim().toLowerCase(),
                request.telefone().trim(),
                request.mensagem().trim()
        );

        return toResponse(contatoRepository.save(contato));
    }

    @Transactional(readOnly = true)
    public List<ContatoResponse> listar() {
        return contatoRepository.findAll(Sort.by(Sort.Direction.DESC, "criadoEm"))
                .stream()
                .map(this::toResponse)
                .toList();
    }

    private ContatoResponse toResponse(Contato contato) {
        return new ContatoResponse(
                contato.getId(),
                contato.getNome(),
                contato.getEmail(),
                contato.getTelefone(),
                contato.getMensagem(),
                contato.getCriadoEm()
        );
    }
}
