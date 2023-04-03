package com.example.mimenu.models;

public class Producto {

    private String descripcion;
    private double precio;
    private String foto;

    public Producto(String descripcion, double precio, String foto) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
