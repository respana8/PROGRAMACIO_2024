import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Robots extends JPanel {
    private int coordenadesAmunt;
    private int coordenadesAvall;
    private int coordenadesDreta;
    private int coordenadesEsquerra;
    private JLabel resultatEtiqueta;

    public Robots() {
        coordenadesAmunt = 0;
        coordenadesAvall = 0;
        coordenadesDreta = 0;
        coordenadesEsquerra = 0;

        JButton botoAmunt = new JButton("🠕");
        JButton botoAvall = new JButton("🠗");
        JButton botoDreta = new JButton("➞");
        JButton botoEsquerra = new JButton("🠔");

        JButton botoEsborrar = new JButton("ESBORRAR");
        JButton botoGuardar = new JButton("GUARDAR");

        resultatEtiqueta = new JLabel(getResultatText());

        botoAmunt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setCoordenadesAmunt(getCoordenadesAmunt() + 1);
                actualitzarResultat();
            }
        });

        botoAvall.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setCoordenadesAvall(getCoordenadesAvall() + 1);
                actualitzarResultat();
            }
        });

        botoDreta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setCoordenadesDreta(getCoordenadesDreta() + 1);
                actualitzarResultat();
            }
        });

        botoEsquerra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setCoordenadesEsquerra(getCoordenadesEsquerra() + 1);
                actualitzarResultat();
            }
        });

        botoEsborrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setCoordenadesAmunt(0);
                setCoordenadesAvall(0);
                setCoordenadesDreta(0);
                setCoordenadesEsquerra(0);
                actualitzarResultat();
            }
        });

        botoGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String resultat = getResultatText() + "\n";
                Emmagatzemar.guardarCoordenades(resultat);
            }
        });

        this.add(botoAmunt);
        this.add(botoAvall);
        this.add(botoDreta);
        this.add(botoEsquerra);
        this.add(resultatEtiqueta);
        this.add(botoEsborrar);
        this.add(botoGuardar);
    }

    private void actualitzarResultat() {
        resultatEtiqueta.setText(getResultatText());
    }

    public String getResultatText() {
        return "🠕" + getCoordenadesAmunt() + " 🠗" + getCoordenadesAvall() + " ➞" + getCoordenadesDreta() + " 🠔" + getCoordenadesEsquerra();
    }

    public int getCoordenadesAmunt() {
        return coordenadesAmunt;
    }

    public void setCoordenadesAmunt(int coordenadesAmunt) {
        this.coordenadesAmunt = coordenadesAmunt;
    }

    public int getCoordenadesAvall() {
        return coordenadesAvall;
    }

    public void setCoordenadesAvall(int coordenadesAvall) {
        this.coordenadesAvall = coordenadesAvall;
    }

    public int getCoordenadesDreta() {
        return coordenadesDreta;
    }

    public void setCoordenadesDreta(int coordenadesDreta) {
        this.coordenadesDreta = coordenadesDreta;
    }

    public int getCoordenadesEsquerra() {
        return coordenadesEsquerra;
    }

    public void setCoordenadesEsquerra(int coordenadesEsquerra) {
        this.coordenadesEsquerra = coordenadesEsquerra;
    }
}
