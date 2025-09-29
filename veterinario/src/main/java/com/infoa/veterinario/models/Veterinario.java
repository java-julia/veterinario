package com.infoa.veterinario.models;

public class Veterinario {

    private int id;
    private String nome;
    private int CRMV;
    private String especializacao;
    private int horasdetrabalho;

    public Veterinario() {}

    public Veterinario(int id, String nome, int cRMV, String especializacao, int horasdetrabalho) {
        this.id = id;
        this.nome = nome;
        CRMV = cRMV;
        this.especializacao = especializacao;
        this.horasdetrabalho = horasdetrabalho;
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

    public int getCRMV() {
        return CRMV;
    }

    public void setCRMV(int cRMV) {
        CRMV = cRMV;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public int getHorasdetrabalho() {
        return horasdetrabalho;
    }

    public void setHorasdetrabalho(int horasdetrabalho) {
        this.horasdetrabalho = horasdetrabalho;
    }

    
    
}
