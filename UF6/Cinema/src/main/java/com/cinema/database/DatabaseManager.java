package com.cinema.database;
import com.cinema.database.models.Director;
import com.cinema.database.models.Pelicula;
import java.sql.*;
public class DatabaseManager {
    private Connection connection;
    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://192.168.1.72:5432/cinema", "postgres", "olakase");
            System.out.println("BBDD IN");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addDirector(Director director) {
        String query = "INSERT INTO Director (id, nom, cognom) VALUES (" + director.getId() + ", '" + director.getNom() + "', '" + director.getCognom() + "')";
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Director afegit.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addPelicula(Pelicula pelicula) {
        String query = "INSERT INTO Pelicula (id, titol, anyEstrena, directorId) VALUES (" + pelicula.getId() + ", '" + pelicula.getTitol() + "', " + pelicula.getAnyEstrena() + ", " + pelicula.getDirectorId() + ")";
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Pel·lícula afegida.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void getPeliculesPerDirector(int directorId) {
        String query = "SELECT * FROM Pelicula WHERE directorId = " + directorId;
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("titol"));
                System.out.println(rs.getInt("anyEstrena"));
                System.out.println(rs.getInt("directorId"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void disconnect() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("OUT");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
