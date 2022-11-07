package br.com.bode.petshop.buscatodospets;

import br.com.bode.petshop.domain.Pet;

public class PetResponse {


    private Long id;

    private String nomeDoPet;
    private Double idade;
    private String nomeDoDono;

    public PetResponse() {

    }
    public PetResponse(Pet pet) {
        this.id = pet.getId();
        this.nomeDoPet = pet.getNome();
        this.idade = pet.getIdade();
        this.nomeDoDono = pet.getDono();
    }

    public Long getId() {
        return id;
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
