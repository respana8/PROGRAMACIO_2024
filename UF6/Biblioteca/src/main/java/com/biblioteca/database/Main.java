package com.biblioteca.database;
import com.biblioteca.database.models.Autor;
import com.biblioteca.database.models.Llibre;
public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        dbManager.connect();
        Autor autor = new Autor(1, "Ruben", "Doblas");
        dbManager.addAutor(autor);
        Llibre llibre = new Llibre(1, "El libro TROLL", 2000, 1);
        dbManager.addLlibre(llibre);
        dbManager.getLlibresPerAutor(1);
        dbManager.disconnect();
    }
}
