
public class Main {
    public static void main(String[] args) {
        InstrumentCorda guitarra = new InstrumentCorda("Guitarra", "Fender", 6);
        InstrumentVent flauta = new InstrumentVent("Flauta", "Yamaha", "Fusta");
        System.out.println(guitarra.getNom() + " TÉ" + guitarra.getNombreCordes() + " cordes.");
        System.out.println(flauta.getNom() + " TIPUS: " + flauta.getTipusVent());
    }
}
