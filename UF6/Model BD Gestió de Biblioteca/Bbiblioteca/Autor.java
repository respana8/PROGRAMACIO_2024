public class Autor {
    private int id;
    private String nom;
    private String cognom;

    public Autor(int id, String nom, String cognom) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getCognom() { return cognom; }
}
