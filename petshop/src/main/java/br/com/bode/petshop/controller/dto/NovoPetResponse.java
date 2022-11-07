package br.com.bode.petshop.controller.dto;

import br.com.bode.petshop.domain.Pet;

public class NovoPetResponse {

    private String nome;
    private String tipoDePet;
    private String dono;

    public NovoPetResponse(String nome, String tipoDePet, String dono) {
        this.nome = nome;
        this.tipoDePet = tipoDePet;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoDePet() {
        return tipoDePet;
    }

    public String getDono() {
        return dono;
    }

}
