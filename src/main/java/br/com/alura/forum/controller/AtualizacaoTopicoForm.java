package br.com.alura.forum.controller;

import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AtualizacaoTopicoForm {

    @Autowired
    private TopicoRepository topicoRepository;

    @NotNull @NotEmpty @Length(min = 10)
    private String titulo;

    @NotNull @NotEmpty @Length(min = 10)
    private String menssagem;

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


    public Topico atualizar(Long id, TopicoRepository topicoRepository) {
        Topico topico = topicoRepository.getOne(id);
        topico.setTitulo(this.titulo);
        topico.setMensagem(this.menssagem);

        return topico;
    }
}
