public class CalculadoraEstadistiques {
    public double calcularMitjana(double[] notes) {
        double suma = 0;
        for (double nota : notes) {
            suma += nota;
        }
        return suma / notes.length;
    }
    public double calcularMaxim(double[] notes) {
        double maxim = Double.MIN_VALUE;
        for (double nota : notes) {
            if (nota > maxim) {
                maxim = nota;
            }
        }
        return maxim;
    }
    public double calcularMinim(double[] notes) {
        double minim = Double.MAX_VALUE;
        for (double nota : notes) {
            if (nota < minim) {
                minim = nota;
            }
        }
        return minim;
    }
}
