public class Llibre {
    private int id;
    private String titol;
    private int anyPublicacio;
    private int autorId;

    public Llibre(int id, String titol, int anyPublicacio, int autorId) {
        this.id = id;
        this.titol = titol;
        this.anyPublicacio = anyPublicacio;
        this.autorId = autorId;
    }

    public int getId() { return id; }
    public String getTitol() { return titol; }
    public int getAnyPublicacio() { return anyPublicacio; }
    public int getAutorId() { return autorId; }
}
