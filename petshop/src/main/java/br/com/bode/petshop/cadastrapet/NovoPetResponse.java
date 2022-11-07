package br.com.bode.petshop.cadastrapet;

import br.com.bode.petshop.domain.Pet;

public class NovoPetResponse {

    private Long id;
    private String nome;
    private String tipoDePet;
    private String dono;

    public NovoPetResponse(Pet pet) {
        this.nome = pet.getNome();
        this.tipoDePet = pet.getTipoDePet();
        this.dono = pet.getDono();
        this.id = pet.getId();
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

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "NovoPetResponse{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipoDePet='" + tipoDePet + '\'' +
                ", dono='" + dono + '\'' +
                '}';
    }
}
