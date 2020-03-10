package br.com.alura.forum.controller;

import br.com.alura.forum.model.Topico;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

public class TopicoDTO {

    private long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    public TopicoDTO(Topico topico) {

        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();

    }

    public static Page<TopicoDTO> convert(Page<Topico> topicos) {
        return topicos.map(TopicoDTO::new);
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
}
