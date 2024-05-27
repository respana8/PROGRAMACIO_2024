import java.util.ArrayList;
import java.util.List;
public class Botiga {
    private List<Producte> productes;

    public Botiga() {
        this.productes = new ArrayList<>();
    }
    public void afegirProducte(Producte producte) {
        productes.add(producte);
    }
    public double calcularPreuTotal() {
        double total = 0.0;
        for (Producte producte : productes) {
            total += producte.calcularPreuFinal();
        }
        return total;
    }
    public void mostrarDetallsProductes() {
        for (Producte producte : productes) {
            System.out.println("Codi: " + producte.getCodi() + ", Nom: " + producte.getNom() + ", Preu Final: " + producte.calcularPreuFinal());
        }
    }
}
