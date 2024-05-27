public class Automovil extends Vehicles{
    private int motor;
    private int cv;
    private String benzina;
    private String marca;
    public Automovil(String nom, int rodes, String traccio){
        super(nom, rodes, traccio);
        this.motor = 1200;
        this.cv = 110;
        this.benzina = "DIESEL";
        this.marca = "SEAT";
    }
    public void imprimirDetallsAutomovil() {
        System.out.println("Motor: " + motor);
        System.out.println("CV: " + cv);
        System.out.println("Tipus debenzina: " + benzina);
        System.out.println("Marca: " + marca);
    }
}
