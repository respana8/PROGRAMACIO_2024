public class InstrumentVent extends Instruments {
    private String tipusVent;
    public InstrumentVent(String nom, String fabricant, String tipusVent) {
        super(nom, fabricant);
        this.tipusVent = tipusVent;
    }
    public String getTipusVent() {
        return tipusVent;
    }
    public void setTipusVent(String tipusVent) {
        this.tipusVent = tipusVent;
    }
}
