import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnexioBaseDades {
    private static final String URL = "jdbc:postgresql://localhost:5432/biblioteca";
    private static final String USUARI = "posgres";
    private static final String CONTRASENYA = "olakase";
    public static Connection getConnexio() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(URL, USUARI, CONTRASENYA);
    }
    public static void main(String[] args) {
        try {
            Connection conn = getConnexio();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
