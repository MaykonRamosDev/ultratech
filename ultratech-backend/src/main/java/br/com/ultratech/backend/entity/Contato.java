package br.com.ultratech.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "contatos")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false, length = 160)
    private String email;

    @Column(nullable = false, length = 30)
    private String telefone;

    @Column(nullable = false, length = 1000)
    private String mensagem;

    @Column(nullable = false, updatable = false)
    private LocalDateTime criadoEm;

    public Contato() {
    }

    public Contato(String nome, String email, String telefone, String mensagem) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.mensagem = mensagem;
    }

    @PrePersist
    public void prePersist() {
        this.criadoEm = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getMensagem() { return mensagem; }
    public LocalDateTime getCriadoEm() { return criadoEm; }

    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }
}
