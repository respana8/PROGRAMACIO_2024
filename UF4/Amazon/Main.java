public class Main {
    public static void main(String[] args) {
        Botiga botiga = new Botiga();
        Aliment aliment = new Aliment(1, "Winston", 4.60, "Mai");
        Electrodomestic electrodomestic = new Electrodomestic(2, "Rentaplats", 300.00, 24);
        Llibre llibre = new Llibre(3, "El Motor del exito", 20.00, "Alex Marin", 168);
        botiga.afegirProducte(aliment);
        botiga.afegirProducte(electrodomestic);
        botiga.afegirProducte(llibre);
        botiga.mostrarDetallsProductes();
        double preuTotal = botiga.calcularPreuTotal();
        System.out.println("TOTAL: " + preuTotal);
    }
}