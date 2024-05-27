public abstract class Instruments {
    private String nom;
    private String fabricant;
    public Instruments(String nom, String fabricant) {
        this.nom = nom;
        this.fabricant = fabricant;
    }
    public abstract void tocar();
    public abstract void afinar();
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFabricant() {
        return fabricant;
    }
    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }
}
