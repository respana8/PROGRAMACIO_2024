import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Emmagatzemar {

    public static void guardarCoordenades(String contingut) {
        String nomFitxer = "dades_robots.txt";
        escriureEnFitxer(nomFitxer, contingut);
    }

    private static void escriureEnFitxer(String nomFitxer, String contingut) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomFitxer, true))) {
            writer.write(contingut);
            writer.newLine(); 
        } catch (IOException e) {
        }
    }
}
