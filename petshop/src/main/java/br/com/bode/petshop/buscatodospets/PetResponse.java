package br.com.bode.petshop.buscatodospets;

import br.com.bode.petshop.domain.Pet;

public class PetResponse {

    private String nomeDoPet;
    private Double idade;
    private String nomeDoDono;

    public PetResponse() {

    }
    public PetResponse(Pet pet) {
        this.nomeDoPet = pet.getNome();
        this.idade = pet.getIdade();
        this.nomeDoDono = pet.getDono();
    }

    public String getNomeDoPet() {
        return nomeDoPet;
    }

    public Double getIdade() {
        return idade;
    }

    public String getNomeDoDono() {
        return nomeDoDono;
    }
}
