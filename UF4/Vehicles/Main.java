public class Main {
    public static void main(String[] args) {
        // NOUS OBJECTES
        Bicicleta Vehicles1 = new Bicicleta("Bici1", 2,"humana");
        Automovil Vehicles2 = new Automovil("Cotxe1", 4, "Mecànica");
        // MÈTODES
        Vehicles1.imprimirDetalls();
        Vehicles1.imprimirDetallsBicicleta();
        Vehicles1.pujarMarxa();
        Vehicles2.imprimirDetalls();
        Vehicles2.imprimirDetallsAutomovil();
        Vehicles2.accelerar();
        Vehicles2.accelerar();
        Vehicles2.accelerar();
        Vehicles2.accelerar();
        Vehicles2.accelerar();
        Vehicles2.accelerar();
        Vehicles2.accelerar();
        Vehicles2.accelerar();
        Vehicles2.frenar();
        Vehicles1.pujarMarxa();
        Vehicles1.pujarMarxa();
        Vehicles1.pujarMarxa();
        Vehicles1.imprimirDetalls();
        Vehicles1.imprimirDetallsBicicleta();
        Vehicles1.baixarMarxa();
        Vehicles1.baixarMarxa();
        Vehicles1.baixarMarxa();
        Vehicles1.baixarMarxa();
    }
}