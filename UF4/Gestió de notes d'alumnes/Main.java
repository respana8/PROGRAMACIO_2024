public class Main {
    public static void main(String[] args) {
        GestorNotes gestor = new GestorNotes();
        double[] notesAlumne1 = { 7.5, 8.0, 6.5 };
        gestor.registrarNotes("Roger", notesAlumne1);
        double[] notesObtingudes = gestor.obtenirNotes("Roger");
            System.out.println("Notes de l'alumne:");
            for (double nota : notesObtingudes) {
                System.out.println(nota);
            }
        CalculadoraEstadistiques calculadora = new CalculadoraEstadistiques();
        double mitjana = calculadora.calcularMitjana(notesAlumne1);
        double maxim = calculadora.calcularMaxim(notesAlumne1);
        double minim = calculadora.calcularMinim(notesAlumne1);
        System.out.println("Mitjana: " + mitjana);
        System.out.println("Nota màxima: " + maxim);
        System.out.println("Nota mínima: " + minim);
    }
}
