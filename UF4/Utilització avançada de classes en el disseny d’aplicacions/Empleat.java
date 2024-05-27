// CLASSE
public class Empleat {
    // ATRIBUTS
    protected String nom;
    protected double salari;
    // CONSTRUCTOR
    public Empleat(String nom, double salari) {
        this.nom = nom;
        this.salari = salari;
    }
    // METODES
    public void imprimirDetalls() {
        System.out.println("Nom: " + nom);
        System.out.println("Salari: " + salari);
    }
}
