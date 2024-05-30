import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexioBaseDades {
    // Cambia la URL para apuntar a tu base de datos PostgreSQL
    private static final String URL = "jdbc:postgresql://localhost:5432/cinema";
    private static final String USUARI = "posgres"; // Ajusta con tu usuario de PostgreSQL
    private static final String CONTRASENYA = "olakase"; // Ajusta con tu contraseña de PostgreSQL

    public static Connection getConnexio() throws SQLException {
        try {
            // Carga el controlador JDBC de PostgreSQL
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // Establece la conexión con la base de datos PostgreSQL
        return DriverManager.getConnection(URL, USUARI, CONTRASENYA);
    }

    public static void main(String[] args) {
        try {
            Connection conn = getConnexio();
            System.out.println("Conexión exitosa!");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
