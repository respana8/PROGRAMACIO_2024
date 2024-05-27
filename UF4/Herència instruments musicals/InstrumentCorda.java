public class InstrumentCorda extends Instruments {
    private int numeroCordes;
    public InstrumentCorda(String nom, String fabricant, int numeroCordes) {
        super(nom, fabricant);
        this.numeroCordes = numeroCordes;
    }
    public int getNombreCordes() {
        return numeroCordes;
    }
    public void setNombreCordes(int nombreCordes) {
        this.numeroCordes = numeroCordes;
    }
}
