package br.com.alura.forum.controller;

public class TokenDTO {

    private String token;
    private String tipo;

    public TokenDTO(String token, String bearer) {
        this.token = token;
        this.tipo = bearer;
    }

    public String getToken() {
        return token;
    }

    public String getTipo() {
        return tipo;
    }
}
