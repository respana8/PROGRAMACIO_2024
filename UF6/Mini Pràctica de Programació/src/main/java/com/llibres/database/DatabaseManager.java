package com.llibres.database;
import com.llibres.database.models.Llibre;
import java.sql.*;
public class GestorBaseDades {
    private Connection connexio;
    public void connectar() {
        try {
            connexio = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "olakase");
            System.out.println("BBDD IN");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void afegirLlibre(Llibre llibre) {
        String query = "INSERT INTO Llibre (id, titol, autor, anyPublicacio) VALUES (" + llibre.getId() + ", '" + llibre.getTitol() + "', '" + llibre.getAutor() + "', " + llibre.getAnyPublicacio() + ")";
        try {
            Statement stmt = connexio.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void getLlibres() {
        String query = "SELECT * FROM Llibre";
        try {
            Statement stmt = connexio.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("titol"));
                System.out.println(rs.getString("autor"));
                System.out.println(rs.getInt("anyPublicacio"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void actualitzarLlibre(Llibre llibre) {
        String query = "UPDATE Llibre SET titol = '" + llibre.getTitol() + "', autor = '" + llibre.getAutor() + "', anyPublicacio = " + llibre.getAnyPublicacio() + " WHERE id = " + llibre.getId();
        try {
            Statement stmt = connexio.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void eliminarLlibre(int Idlibre) {
        String query = "DELETE FROM Llibre WHERE id = " + Idlibre;
        try {
            Statement stmt = connexio.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void desconnectar() {
        try {
            if (connexio != null) {
                connexio.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
