package com.example.recyclerviewteste.model;

public class Carro {

    private int id;
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carro(int id, String modelo) {
        this.id = id;
        this.modelo = modelo;
    }
}
