package br.com.alura.forum.controller;

import br.com.alura.forum.model.Resposta;

import java.time.LocalDateTime;

public class RespostaDTO {

    private Long id;
    private String menssagem;
    private LocalDateTime dataRespota;
    private String nomeAutor;

    public RespostaDTO(Resposta resposta) {
        this.id = resposta.getId();
        this.menssagem = resposta.getMensagem();
        this.dataRespota = resposta.getDataCriacao();
        this.nomeAutor = resposta.getAutor().getNome();
    }

    public Long getId() {
        return id;
    }

    public String getMenssagem() {
        return menssagem;
    }

    public LocalDateTime getDataRespota() {
        return dataRespota;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }
}
