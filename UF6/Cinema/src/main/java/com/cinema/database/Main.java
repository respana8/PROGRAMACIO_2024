package com.cinema.database;
import com.cinema.database.models.Director;
import com.cinema.database.models.Pelicula;
public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        dbManager.connect();
        Director director = new Director(1, "Sacha", "Baron cohen");
        dbManager.addDirector(director);
        Pelicula pelicula = new Pelicula(1, "Borat", 2007, 1);
        dbManager.addPelicula(pelicula);
        dbManager.getPeliculesPerDirector(1);
        dbManager.disconnect();
    }
}
