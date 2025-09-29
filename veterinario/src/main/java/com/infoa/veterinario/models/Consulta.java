package com.infoa.veterinario.models;

import java.time.LocalDate;

public class Consulta {

    private int id;
    private LocalDate data;
    private Animal animal;
    private Veterinario veterinario;
    private String observacoesmedicas;

    public Consulta() {}

    public Consulta(int id, LocalDate data, Animal animal, Veterinario veterinario, String observacoesmedicas) {
        this.id = id;
        this.data = data;
        this.animal = animal;
        this.veterinario = veterinario;
        this.observacoesmedicas = observacoesmedicas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getObservacoesmedicas() {
        return observacoesmedicas;
    }

    public void setObservacoesmedicas(String observacoesmedicas) {
        this.observacoesmedicas = observacoesmedicas;
    }
    
    
}
