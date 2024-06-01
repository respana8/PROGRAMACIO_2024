package com.llibres.database;
import com.llibres.database.models.Llibre;
public class Main {
    public static void main(String[] args) {
        GestorBaseDades gestorBD = new GestorBaseDades();
        gestorBD.connectar();
        Llibre llibre = new Llibre(1, "El libro TROLL", "Ruben Doblas", 2014);
        gestorBD.afegirLlibre(llibre);
        gestorBD.getLlibres();
        llibre.setTitol("El libro TROLL EDICIÓ 2");
        gestorBD.actualitzarLlibre(llibre);
        gestorBD.eliminarLlibre(1);
        gestorBD.desconnectar();
    }
}
