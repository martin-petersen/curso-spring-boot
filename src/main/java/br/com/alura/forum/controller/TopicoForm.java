package br.com.alura.forum.controller;

import br.com.alura.forum.model.Topico;

public class TopicoForm {
    private String titulo;
    private String menssagem;
    private String nomeCurso;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMenssagem() {
        return menssagem;
    }

    public void setMenssagem(String menssagem) {
        this.menssagem = menssagem;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Topico convert() {
        return new Topico(getTitulo(),getMenssagem(),getNomeCurso());
    }
}
