// CLASSE
public class EmpleatPerHores extends Empleat {
    // ATRIBUTS
    private int horesTreballades;
    private double tarifaPerHora;
    // CONSTRUCTORS
    public EmpleatPerHores(String nom, double salari, int horesTreballades, double tarifaPerHora) {
        super(nom, salari);
        this.horesTreballades = horesTreballades;
        this.tarifaPerHora = tarifaPerHora;
    }
    // METODES
    public void calcularSalari() {
        salari = horesTreballades * tarifaPerHora;
    }
}
