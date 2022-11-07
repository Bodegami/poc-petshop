package br.com.bode.petshop.controller.dto;

import br.com.bode.petshop.domain.Pet;

public class NovoPetRequest {

    private String nome;
    private String tipoDePet;
    private String raca;
    private Double idade;
    private String dono;

    public NovoPetRequest(String nome, String tipoDePet, String raca, Double idade, String dono) {
        this.nome = nome;
        this.tipoDePet = tipoDePet;
        this.raca = raca;
        this.idade = idade;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoDePet() {
        return tipoDePet;
    }

    public String getRaca() {
        return raca;
    }

    public Double getIdade() {
        return idade;
    }

    public String getDono() {
        return dono;
    }

    public Pet toModel() {
        return new Pet(this.nome, this.tipoDePet, this.raca, this.idade, this.dono);
    }

}
