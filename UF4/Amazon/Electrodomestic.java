public class Electrodomestic extends Producte {
    private int mesosGarantia;
    public Electrodomestic(int codi, String nom, double preu, int mesosGarantia) {
        super(codi, nom, preu);
        this.mesosGarantia = mesosGarantia;
    }
    public int getMesosGarantia() {
        return mesosGarantia;
    }
    public void setMesosGarantia(int mesosGarantia) {
        this.mesosGarantia = mesosGarantia;
    }
    public double calcularPreuFinal() {
        if (mesosGarantia > 12) {
            return getPreu() * 1.1;
        }
        return getPreu();
    }
}
