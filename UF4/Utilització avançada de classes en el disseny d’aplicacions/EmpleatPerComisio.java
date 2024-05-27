// CLASSE
public class EmpleatPerComisio extends Empleat {
    // ATRIBUS
    private double vendesRealitzades;
    private double comissioPerVenta;
    // CONSTRUCTOR
    public EmpleatPerComisio(String nom, double salari, double vendesRealitzades, double comissioPerVenta) {
        super(nom, salari);
        this.vendesRealitzades = vendesRealitzades;
        this.comissioPerVenta = comissioPerVenta;
    }
    // METODE
    public void calcularSalari() {
        salari = salari + (vendesRealitzades * comissioPerVenta);
    }
}
