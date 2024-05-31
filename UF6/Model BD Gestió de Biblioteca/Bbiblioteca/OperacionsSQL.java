import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OperacionsSQL {
    public void inserirAutor(Autor autor) throws SQLException {
        String sql = "INSERT INTO Autor (id, nom, cognom) VALUES (?, ?, ?)";
        try (Connection conn = ConnexioBaseDades.getConnexio();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, autor.getId());
            pstmt.setString(2, autor.getNom());
            pstmt.setString(3, autor.getCognom());
            pstmt.executeUpdate();
        }
    }

    public void inserirLlibre(Llibre llibre) throws SQLException {
        String sql = "INSERT INTO Llibre (id, titol, anyPublicacio, autorId) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConnexioBaseDades.getConnexio();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, llibre.getId());
            pstmt.setString(2, llibre.getTitol());
            pstmt.setInt(3, llibre.getAnyPublicacio());
            pstmt.setInt(4, llibre.getAutorId());
            pstmt.executeUpdate();
        }
    }
}
