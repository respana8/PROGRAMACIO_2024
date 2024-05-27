import java.util.ArrayList;
import java.util.List;
public class GestorNotes {
    private List<Alumne> alumnes;
    public GestorNotes() {
        alumnes = new ArrayList<>();
    }
    public void registrarNotes(String nomAlumne, double[] notes) {
        Alumne alumne = new Alumne(nomAlumne, notes);
        alumnes.add(alumne);
    }
    public double[] obtenirNotes(String nomAlumne) {
        for (Alumne alumne : alumnes) {
            if (alumne.getNom().equals(nomAlumne)) {
                return alumne.getNotes();
            }
        }
        return null;
    }
}
