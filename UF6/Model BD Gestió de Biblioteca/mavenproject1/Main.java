import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OperacionsSQL dbOps = new OperacionsSQL();
        Autor autor = new Autor(2, "Ruben", "Doblas");

        try {
            dbOps.inserirAutor(autor);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Llibre llibre = new Llibre(2, "El libro TROLL", 2014, 2);

        try {
            dbOps.inserirLlibre(llibre);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
