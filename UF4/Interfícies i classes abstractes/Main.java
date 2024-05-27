public class Main {
    public static void main(String[] args) {
        Cercle cercle = new Cercle("Cercle", 5.0);
        Rectangle rectangle = new Rectangle("Rectangle", 4.0, 6.0);
        System.out.println("Área Cercle: " + cercle.calcularArea());
        System.out.println("Perímetre Cercle: " + cercle.calcularPerimetre());
        System.out.println("Área Rectangle: " + rectangle.calcularArea());
        System.out.println("Perímetre Rectangle: " + rectangle.calcularPerimetre());
    }
}