package br.com.alura.forum.config;

public class ErroDeFormularioDTO {

    private String campo;
    private String menssagem;

    public ErroDeFormularioDTO(String campo, String menssagem) {
        this.campo = campo;
        this.menssagem = menssagem;
    }

    public String getCampo() {
        return campo;
    }

    public String getMenssagem() {
        return menssagem;
    }
}
