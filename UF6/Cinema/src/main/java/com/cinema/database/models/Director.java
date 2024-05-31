package com.biblioteca.database.models;
public class Director {
    private int id;
    private String nom;
    private String cognom;
    public Director(int id, String nom, String cognom) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getCognom() {
        return cognom;
    }
    public String toString() {
        return id + nom + cognom;
    }
}
