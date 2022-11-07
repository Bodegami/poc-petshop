package br.com.bode.petshop.domain;

public class Pet {

    private String nome;
    private String tipoDePet;
    private String raca;
    private Double idade;
    private String dono;

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
}
