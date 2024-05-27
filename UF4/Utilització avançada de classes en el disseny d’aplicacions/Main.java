
public class Main {
    public static void main(String[] args) {
        // NOUS OBJECTES
        EmpleatPerHores empleat1 = new EmpleatPerHores("Rosa", 0, 40, 20);
        EmpleatPerHores empleat2 = new EmpleatPerHores("Ana", 0, 40, 20);
        EmpleatPerComisio empleat3 = new EmpleatPerComisio("Elva", 2000, 10000, 0.1);

        // MÈTODES
        empleat1.calcularSalari();
        empleat3.calcularSalari();
        empleat1.imprimirDetalls();
        empleat2.imprimirDetalls();
        empleat3.imprimirDetalls();
    }
}
