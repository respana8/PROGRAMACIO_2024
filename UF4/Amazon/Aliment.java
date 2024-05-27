public class Aliment extends Producte {
    private String dataCaducitat;
    public Aliment(int codi, String nom, double preu, String dataCaducitat) {
        super(codi, nom, preu);
        this.dataCaducitat = dataCaducitat;
    }
    public String getDataCaducitat() {
        return dataCaducitat;
    }
    public void setDataCaducitat(String dataCaducitat) {
        this.dataCaducitat = dataCaducitat;
    }
    public double calcularPreuFinal() {
        if (dataCaducitat.equals("propera")) {
            return getPreu() * 0.8;
        }
        return getPreu();
    }
}
