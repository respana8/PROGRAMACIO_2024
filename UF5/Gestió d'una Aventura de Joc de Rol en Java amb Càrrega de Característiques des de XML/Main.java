public class Main {
    public static void main(String[] args) {
        // Rutas a los archivos XML
        String rutaArma = "armes.xml";
        String rutaArmadura = "armadures.xml";
        String rutaPocio = "pocions.xml";

        // Crear personajes
        Personatge1 personatge1 = new Personatge1("Gandalf", 10, 100, 150, 0);
        Personatge2 personatge2 = new Personatge2("Aragorn", 8, 120, 80, 0);

        // Equipar personajes
        System.out.println("##########################################");
        System.out.println("############ INICI DEL JOC ##############");
        System.out.println("##########################################");
        personatge1.equiparPersonatge(rutaArma, rutaArmadura, rutaPocio);
        personatge2.equiparPersonatge(rutaArma, rutaArmadura, rutaPocio);

        // Estadísticas finales
        System.out.println("##########################################");
        System.out.println("Dades finals dels personatges:");
        System.out.println("Vida i mana de " + personatge1.getNom() + ": " + personatge1.getPuntsDeVida() + " HP, " + personatge1.getPuntsDeMana() + " MP");
        System.out.println("Vida i mana de " + personatge2.getNom() + ": " + personatge2.getPuntsDeVida() + " HP, " + personatge2.getPuntsDeMana() + " MP");

        // Lucha
        System.out.println("##########################################");
        System.out.println("######## PERSONATGE 1 VS. PERSONATGE 2 #########");
        System.out.println("##########################################");
        while (personatge1.getPuntsDeVida() > 0 && personatge2.getPuntsDeVida() > 0) {
            int danysPersonatge1 = personatge1.getDanys();
            System.out.println(personatge1.getNom() + " ataca a " + personatge2.getNom() + " i li fa " + danysPersonatge1 + " de danys.");
            personatge2.setPuntsDeVida(personatge2.getPuntsDeVida() - danysPersonatge1);
            if (personatge2.getPuntsDeVida() <= 0) {
                System.out.println(personatge2.getNom() + " DEP");
                System.out.println("##########################################");
                System.out.println("PERSONATGE 1 GUANYA");
                break;
            }
            int danysPersonatge2 = personatge2.getDanys();
            System.out.println(personatge2.getNom() + " ataca a " + personatge1.getNom() + " i li fa " + danysPersonatge2 + " de danys.");
            personatge1.setPuntsDeVida(personatge1.getPuntsDeVida() - danysPersonatge2);
            if (personatge1.getPuntsDeVida() <= 0) {
                System.out.println(personatge1.getNom() + " DEP");
                System.out.println("##########################################");
                System.out.println("PERSONATGE 2 GUANYA");
                break;
            }
        }
    }
}
