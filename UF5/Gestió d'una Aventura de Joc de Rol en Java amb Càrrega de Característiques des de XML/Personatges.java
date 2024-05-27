import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

public class Personatges {
    private String nom;
    private int nivell;
    private int puntsDeVida;
    private int puntsDeMana;
    private int danys;

    public Personatges(String nom, int nivell, int puntsDeVida, int puntsDeMana, int danys) {
        this.nom = nom;
        this.nivell = nivell;
        this.puntsDeVida = puntsDeVida;
        this.puntsDeMana = puntsDeMana;
        this.danys = danys;
    }

    public void equiparPersonatge(String rutaArma, String rutaArmadura, String rutaPocio) {
        equiparArma(rutaArma);
        equiparArmadura(rutaArmadura);
        equiparPocio(rutaPocio);
    }

    private void equiparArma(String rutaArma) {
        try {
            File file = new File(rutaArma);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
            Element element = (Element) doc.getElementsByTagName("arma").item(0);
            String nomArma = element.getElementsByTagName("nom").item(0).getTextContent();
            int danysArma = Integer.parseInt(element.getElementsByTagName("danys").item(0).getTextContent());
            System.out.println("Arma equipada: " + nomArma + ", Danys: " + danysArma);
            this.danys += danysArma;
        } catch (Exception e) {
        }
    }

    private void equiparArmadura(String rutaArmadura) {
        try {
            File file = new File(rutaArmadura);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
            Element element = (Element) doc.getElementsByTagName("armadura").item(0);
            String nomArmadura = element.getElementsByTagName("nom").item(0).getTextContent();
            int puntsDeVidaArmadura = Integer.parseInt(element.getElementsByTagName("puntsDeVida").item(0).getTextContent());
            System.out.println("Armadura equipada: " + nomArmadura + ", Punts de Vida: " + puntsDeVidaArmadura);
            this.puntsDeVida += puntsDeVidaArmadura;
        } catch (Exception e) {
        }
    }

    private void equiparPocio(String rutaPocio) {
        try {
            File file = new File(rutaPocio);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
            Element element = (Element) doc.getElementsByTagName("pocio").item(0);
            String nomPocio = element.getElementsByTagName("nom").item(0).getTextContent();
            int puntsDeVidaPocio = Integer.parseInt(element.getElementsByTagName("puntsDeVida").item(0).getTextContent());
            int puntsDeManaPocio = Integer.parseInt(element.getElementsByTagName("puntsDeMana").item(0).getTextContent());
            System.out.println("Poció equipada: " + nomPocio + ", Punts de Vida: " + puntsDeVidaPocio + ", Punts de Mana: " + puntsDeManaPocio);
            this.puntsDeVida += puntsDeVidaPocio;
            this.puntsDeMana += puntsDeManaPocio;
        } catch (Exception e) {

        }
    }

    public String getNom() {
        return nom;
    }

    public int getNivell() {
        return nivell;
    }

    public int getPuntsDeVida() {
        return puntsDeVida;
    }

    public void setPuntsDeVida(int puntsDeVida) {
        this.puntsDeVida = puntsDeVida;
    }

    public int getPuntsDeMana() {
        return puntsDeMana;
    }

    public void setPuntsDeMana(int puntsDeMana) {
        this.puntsDeMana = puntsDeMana;
    }

    public int getDanys() {
        return danys;
    }

    public void setDanys(int danys) {
        this.danys = danys;
    }
}
