public class Rectangle extends Figura2D {
    private double base;
    private double altura;
    public Rectangle(String nom, double base, double altura) {
        super(nom);
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea() {
        return base * altura;
    }
    public double calcularPerimetre() {
        return 2 * (base + altura);
    }
}