public abstract class Producte {
    private int codi;
    private String nom;
    private double preu;
    public Producte(int codi, String nom, double preu) {
        this.codi = codi;
        this.nom = nom;
        this.preu = preu;
    }
    public int getCodi() {
        return codi;
    }
    public void setCodi(int codi) {
        this.codi = codi;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getPreu() {
        return preu;
    }
    public void setPreu(double preu) {
        this.preu = preu;
    }
    public abstract double calcularPreuFinal();
}
