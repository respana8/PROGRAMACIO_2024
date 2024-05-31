package com.cinema.database.models;
public class Llibre{
    private int id;
    private String name;
    private String lastName;
    public Llibre(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String toString() {
        return id + name + lastName;
    }
}
