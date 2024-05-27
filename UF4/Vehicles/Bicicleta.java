public class Bicicleta extends Vehicles{
    private int marxes;
    private double ampleRodes;
    public Bicicleta(String nom, int rodes, String traccio){
        super(nom, rodes, traccio);
        this.marxes = 0;
        this.ampleRodes = 29;
    }
    public void pujarMarxa(){
        this.marxes += 1;
        System.out.println("Marxa actual: " + marxes);
    }
    public void baixarMarxa(){
        this.marxes -= 1;
        System.out.println("Marxa actual: " + marxes);
    }
    public void imprimirDetallsBicicleta() {
        System.out.println("AmpleRodes: " + ampleRodes);
    }
}
