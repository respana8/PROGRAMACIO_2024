////////////////
///ESTUDIANT///
////////////////

///CLASSE
public class Estudiant{
  String nom;
  String edat;
  String curs;

///CONSTRUCTOR

  public Estudiant(  String nom, String edat, String curs;){
    this.nom = nom;
    this.edat = edat;
    this.curs = curs;
  }

///MÈTODES

public void cambiarNom(String nom) {
    this.nom = nom;
}

public void cambiarEdat(String edat) {
    this.edat = edat;
}

public void cambiarCurs(String curs) {
    this.curs = curs;
}

}


////////////////
/////CERCLE/////
////////////////

///CLASSE
public class Cercle{
  doubble radi;
  double area;
  double perimetre;

///CONSTRUCTOR

  public Cercle(  int radi, int area, int perimetre;){
    this.radi = radi;
    this.area = area;
    this.perimetre = perimetre;
  }

///MÈTODES

public void calcularArea() {
      this.area = 2 * 3.14 * radi;
  }

  public void calcularPerimetre() {
      this.perimetre = 3.14 * (radi * 2);
  }

}

////////////////
////TASQUES////
////////////////

///CLASSE
public class Tasques{
  String descripcio;
  String estat;
  String nom;

///CONSTRUCTOR

  public Estudiant(  String descripcio, String nom, String estat;){
    this.nom = nom;
    this.descripcio = descripcio;
    this.estat = estat;
  }

///MÈTODES

public void cambiarNom(String nom) {
    this.nom = nom;
}

public void afegirDescripcio(String descripcio) {
    this.descripcio = descripcio;
}

public void cambiarEdat(String estat) {
    this.estat = estat;
}

}
