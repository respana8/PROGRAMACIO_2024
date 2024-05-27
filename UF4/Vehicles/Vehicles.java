public class Vehicles {
    protected String nom;
    protected int rodes;
    protected String traccio;
    private int velocitat;
    public Vehicles(String nom, int rodes, String traccio){
        this.nom = nom;
        this.rodes = rodes;
        this.traccio = traccio;
        this.velocitat = 0;
    }
    public void accelerar() {
        System.out.println("velocitat augmentada en 10 km");
        this.velocitat += 10;
        System.out.println("Velocitat actual: " + velocitat);
    }
    public void frenar() {
        this.velocitat = 0;
        System.out.println("Velocitat actual: " + velocitat);
    }
    public void imprimirDetalls() {
        System.out.println("Nom: " + nom);
        System.out.println("Numero de rodes: " + rodes);
        System.out.println("Tipus de tracció: " + traccio);
    }
}
