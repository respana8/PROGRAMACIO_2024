import java.io.*;
import java.util.*;

public class GestorTasques {
    private List<Tasca> tasques = new ArrayList<>();
    private String nomFitxer;
    public GestorTasques(String nomFitxer) {
        this.nomFitxer = nomFitxer;
        carregarTasques();
    }
    public void afegirTasca(Tasca tasca) {
        tasques.add(tasca);
    }
    public void modificarTasca(String titol, Tasca novaTasca) {
        Tasca tasca = trobarTasca(titol);
        if (tasca != null) {
            tasca.setTitol(novaTasca.getTitol());
            tasca.setDescripcio(novaTasca.getDescripcio());
            tasca.setDataVenciment(novaTasca.getDataVenciment());
            tasca.setEstat(novaTasca.getEstat());
        }
    }
    public void eliminarTasca(String titol) {
        Tasca tasca =(titol);
        if (tasca != null) {
            tasques.remove(tasca);
        }
    }
    public List<Tasca> getTasques() {
        return tasques;
    }
    public Tasca trobarTasca(String titol) {
        for (Tasca tasca : tasques) {
            if (tasca.getTitol().equalsIgnoreCase(titol)) {
                return tasca;
            }
        }
        return null;
    }
    private void carregarTasques() {
        File fitxer = new File(nomFitxer);
        if (!fitxer.exists()) {
            return;
        }
        try (BufferedReader lector = new BufferedReader(new FileReader(fitxer))) {
            String linia;
            while ((linia = lector.readLine()) != null) {
                tasques.add(Tasca.desdeCadena(linia));
            }
        } catch (IOException e) {
        }
    }

    public void guardarTasques() {
        try (BufferedWriter escriptor = new BufferedWriter(new FileWriter(nomFitxer))) {
            for (Tasca tasca : tasques) {
                escriptor.write(tasca.toString());
                escriptor.newLine();
            }
            System.out.println("OK");
        } catch (IOException e) {
        }
    }
}