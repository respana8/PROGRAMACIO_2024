public class Pelicula {
    private int id;
    private String titol;
    private int anyEstrena;
    private int directorId;

    public Pelicula(int id, String titol, int anyEstrena, int directorId) {
        this.id = id;
        this.titol = titol;
        this.anyEstrena = anyEstrena;
        this.directorId = directorId;
    }

    public int getId() { return id; }
    public String getTitol() { return titol; }
    public int getAnyEstrena() { return anyEstrena; }
    public int getDirectorId() { return directorId; }
}
