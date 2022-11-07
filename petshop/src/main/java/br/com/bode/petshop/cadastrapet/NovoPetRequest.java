package br.com.bode.petshop.cadastrapet;

import br.com.bode.petshop.domain.Pet;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

public class NovoPetRequest {

    @NotNull(message = "Pet name is a mandatory")
    private String nome;

    @NotBlank(message = "The type of your pet is a mandatory")
    private String tipoDePet;

    @NotBlank(message = "The race of your pet is a mandatory")
    private String raca;

    @NotNull(message = "The age of your pet is a mandatory")
    private Double idade;

    @NotBlank(message = "The owner name is a mandatory")
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
