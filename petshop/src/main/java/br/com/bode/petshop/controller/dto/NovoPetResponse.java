package br.com.bode.petshop.controller.dto;

import br.com.bode.petshop.domain.Pet;

public class NovoPetResponse {

    private String nome;
    private String tipoDePet;
    private String dono;

    public NovoPetResponse(Pet pet) {
        this.nome = pet.getNome();
        this.tipoDePet = pet.getTipoDePet();
        this.dono = pet.getDono();
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

    @Override
    public String toString() {
        return String.format("Nome: %s - Tipo de pet: %s - Dono: %s", this.nome, this.tipoDePet, this.dono);

    }

}
