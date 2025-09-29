package com.infoa.veterinario.models;

public class Animal {

    private int id;
    private String nome;
    private especie especie;
    private String raca;
    private int idade;
    private String observacoes;
    private Dono dono;

    public Animal() {}

    public Animal(int id, String nome, com.infoa.veterinario.models.especie especie, String raca, int idade,
            String observacoes, Dono dono) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.observacoes = observacoes;
        this.dono = dono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public especie getEspecie() {
        return especie;
    }

    public void setEspecie(especie especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    

    
}
