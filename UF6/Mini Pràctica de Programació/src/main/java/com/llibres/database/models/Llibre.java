package com.llibres.database.models;
public class Llibre {
    private int id;
    private String titol;
    private String autor;
    private int anyPublicacio;
    public Llibre(int id, String titol, String autor, int anyPublicacio) {
        this.id = id;
        this.titol = titol;
        this.autor = autor;
        this.anyPublicacio = anyPublicacio;
    }
    public int getId() {
        return id;
    }
    public String getTitol() {
        return titol;
    }
    public void setTitol(String titol) {
        this.titol = titol;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnyPublicacio() {
        return anyPublicacio;
    }
    public void setAnyPublicacio(int anyPublicacio) {
        this.anyPublicacio = anyPublicacio;
    }
    public String toString() {
        return id + titol + autor + anyPublicacio;
    }
}
