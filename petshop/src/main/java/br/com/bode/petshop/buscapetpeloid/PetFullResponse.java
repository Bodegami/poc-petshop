package br.com.bode.petshop.buscapetpeloid;

import br.com.bode.petshop.domain.Pet;

public class PetFullResponse {

    private Long id;
    private String nome;
    private String tipoDePet;
    private String raca;
    private Double idade;
    private String dono;

    public PetFullResponse(Pet pet) {
        this.id = pet.getId();
        this.nome = pet.getNome();
        this.tipoDePet = pet.getTipoDePet();
        this.raca = pet.getRaca();
        this.idade = pet.getIdade();
        this.dono = pet.getDono();
    }

    public Long getId() {
        return id;
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
}
