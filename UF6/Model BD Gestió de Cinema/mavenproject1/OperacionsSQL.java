import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OperacionsSQL {
    public void inserirDirector(Director director) throws SQLException {
        String sql = "INSERT INTO Director (id, nom, cognom) VALUES (?, ?, ?)";
        try (Connection conn = ConnexioBaseDades.getConnexio();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, director.getId());
            pstmt.setString(2, director.getNom());
            pstmt.setString(3, director.getCognom());
            pstmt.executeUpdate();
        }
    }

    public void inserirPelicula(Pelicula pelicula) throws SQLException {
        String sql = "INSERT INTO Pelicula (id, titol, anyEstrena, directorId) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConnexioBaseDades.getConnexio();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, pelicula.getId());
            pstmt.setString(2, pelicula.getTitol());
            pstmt.setInt(3, pelicula.getAnyEstrena());
            pstmt.setInt(4, pelicula.getDirectorId());
            pstmt.executeUpdate();
        }
    }
}
