package com.example.guia3;

public class Nombre {

    private String nombre;

    public Nombre() {
    }

    public Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
