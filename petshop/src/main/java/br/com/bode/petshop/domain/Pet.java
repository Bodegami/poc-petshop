package br.com.bode.petshop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tb_pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipoDePet;
    private String raca;
    private Double idade;
    private String dono;

    //HIBERNATE ONLY
    @Deprecated
    public Pet() {

    }

    public Pet(String nome, String tipoDePet, String raca, Double idade, String dono) {
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

    public Long getId() {
        return id;
    }
}
