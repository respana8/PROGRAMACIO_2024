import java.sql.SQLException;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            OperacionsSQL dbOps = new OperacionsSQL();
            Director director = new Director(1, "Quentin", "Tarantino");
    
            try {
                dbOps.inserirDirector(director);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            Pelicula pelicula = new Pelicula(1, "Pulp Fiction", 1994, 1);
            try {
                dbOps.inserirPelicula(pelicula);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }