public class Cercle extends Figura2D {
    private double radi;
    public Cercle(String nom, double radi) {
        super(nom);
        this.radi = radi;
    }
    public double calcularArea() {
        radi = radi * radi * 3.14;
        return radi;
    }
    public double calcularPerimetre() {
        return 2 * 3.14 * radi;
    }
}