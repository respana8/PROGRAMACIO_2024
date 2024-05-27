public class Llibre extends Producte {
    private String autor;
    private int numPagines;
    public Llibre(int codi, String nom, double preu, String autor, int numPagines) {
        super(codi, nom, preu);
        this.autor = autor;
        this.numPagines = numPagines;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumPagines() {
        return numPagines;
    }
    public void setNumPagines(int numPagines) {
        this.numPagines = numPagines;
    }
    public double calcularPreuFinal() {
        if (numPagines > 300) {
            return getPreu() * 0.95;
        }
        return getPreu();
    }
}
