import java.io.*;
import java.util.*;

public class Tasca {
    private String titol;
    private String descripcio;
    private String dataVenciment;
    private String estat;

    public Tasca(String titol, String descripcio, String dataVenciment, String estat) {
        this.titol = titol;
        this.descripcio = descripcio;
        this.dataVenciment = dataVenciment;
        this.estat = estat;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getDataVenciment() {
        return dataVenciment;
    }

    public void setDataVenciment(String dataVenciment) {
        this.dataVenciment = dataVenciment;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public String toString() {
        return titol + "," + descripcio + "," + dataVenciment + "," + estat;
    }
    
    public static Tasca desdeCadena(String tascaString) {
        String[] parts = tascaString.split(",");
        if (parts.length == 4) {
            return new Tasca(parts[0], parts[1], parts[2], parts[3]);
        } else {
            return null;
        }
    }
}