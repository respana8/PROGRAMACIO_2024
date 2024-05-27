import java.util.Scanner;
public class Main {
    private static GestorTasques gestorTasques;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix el nom del fitxer de tasques:");
        String nomFitxer = scanner.nextLine();
        gestorTasques = new GestorTasques(nomFitxer);
        while (true) {
            mostrarMenu();
            int opcio;
            try {
                opcio = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Selecciona una opció: ");
                continue;
            }
            switch (opcio) {
                case 1:
                    afegirTasca(scanner);
                    break;
                case 2:
                    modificarTasca(scanner);
                    break;
                case 3:
                    eliminarTasca(scanner);
                    break;
                case 4:
                    visualitzarTasques();
                    break;
                case 5:
                    gestorTasques.guardarTasques();
                    return;
                default:
            }
        }
    }
    private static void mostrarMenu() {
        System.out.println("1. Afegir nova tasca");
        System.out.println("2. Modificar una tasca existent");
        System.out.println("3. Eliminar una tasca existent");
        System.out.println("4. Visualitzar la llista de tasques");
        System.out.println("5. Sortir");
    }
    private static void afegirTasca(Scanner scanner) {
        System.out.println("Introdueix el títol de la tasca:");
        String titol = scanner.nextLine();
        System.out.println("Introdueix la descripció de la tasca:");
        String descripcio = scanner.nextLine();
        System.out.println("Introdueix la data de venciment:");
        String dataVenciment = scanner.nextLine();
        System.out.println("Introdueix l'estat (pendent, en curs, completada):");
        String estat = scanner.nextLine();

        Tasca novaTasca = new Tasca(titol, descripcio, dataVenciment, estat);
        gestorTasques.afegirTasca(novaTasca);
    }
    private static void modificarTasca(Scanner scanner) {
        System.out.println("Introdueix el títol de la tasca que vols modificar:");
        String titol = scanner.nextLine();
        Tasca tasca = GestorTasques.trobarTasca(titol);
        if (tasca == null) {
            System.out.println("NO EXISTEIX.");
            return;
        }
        System.out.println("Introdueix la nova descripció de la tasca:");
        String descripcio = scanner.nextLine();
        System.out.println("Introdueix la nova data de venciment:");
        String dataVenciment = scanner.nextLine();
        System.out.println("Introdueix el nou estat (pendent, en curs, completada):");
        String estat = scanner.nextLine();

        Tasca novaTasca = new Tasca(titol, descripcio, dataVenciment, estat);
        GestorTasques.modificarTasca(titol, novaTasca);
        System.out.println("OK");
    }
    private static void eliminarTasca(Scanner scanner) {
        System.out.println("Tasca a eliminar:");
        String titol = scanner.nextLine();
        GestorTasques.eliminarTasca(titol);;
    }
    private static void visualitzarTasques() {
        for (Tasca tasca : GestorTasques.getTasques()) {
            System.out.println("Títol: " + tasca.getTitol());
            System.out.println("Descripció: " + tasca.getDescripcio());
            System.out.println("Data de venciment: " + tasca.getDataVenciment());
            System.out.println("Estat: " + tasca.getEstat());
            System.out.println("------------------------");
        }
    }
}
