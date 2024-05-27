import java.util.ArrayList;
import java.util.List;
class Alumne {
    private String nom;
    private double[] notes;
    public Alumne(String nom, double[] notes) {
        this.nom = nom;
        this.notes = notes;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double[] getNotes() {
        return notes;
    }
    public void setNotes(double[] notes) {
        this.notes = notes;
    }
}