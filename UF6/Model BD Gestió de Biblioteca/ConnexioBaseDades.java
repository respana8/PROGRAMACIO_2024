import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexioBaseDades {
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USUARI = "root";
    private static final String CONTRASENYA = "";

    public static Connection getConnexio() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
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
