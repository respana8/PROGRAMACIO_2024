package com.biblioteca.database;
import com.biblioteca.database.models.Autor;
import com.biblioteca.database.models.Llibre;
import java.sql.*;
public class DatabaseManager {
    private Connection connection;
    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://192.168.1.72:5432/biblioteca", "postgres", "olakase");
            System.out.println("BBDD IN");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addAutor(Autor autor) {
        String query = "INSERT INTO Autor (id, nom, cognom) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, autor.getId());
            stmt.setString(2, autor.getNom());
            stmt.setString(3, autor.getCognom());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addLlibre(Llibre llibre) {
        String query = "INSERT INTO Llibre (id, titol, anyPublicacio, autorId) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, llibre.getId());
            stmt.setString(2, llibre.getTitol());
            stmt.setInt(3, llibre.getAnyPublicacio());
            stmt.setInt(4, llibre.getAutorId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void getLlibresPerAutor(int autorId) {
        String query = "SELECT * FROM Llibre WHERE autorId = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, autorId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("titol"));
                System.out.println(rs.getInt("anyPublicacio"));
                System.out.println(rs.getInt("autorId"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("OUT");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
