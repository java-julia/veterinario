package com.infoa.veterinario.models;

public class Dono {

    private int id;
    private String nomecompleto;
    private int CPF;
    private String endereco;
    private int telefone;

    public Dono() {}

    public Dono(int id, String nomecompleto, int cPF, String endereco, int telefone) {
        this.id = id;
        this.nomecompleto = nomecompleto;
        CPF = cPF;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int cPF) {
        CPF = cPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
    
}
