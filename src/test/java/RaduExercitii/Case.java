package RaduExercitii;

public class Case {
    public String tip;
    public int numareDeEtaje;
    public String numarDeCamere;
    public String tipDeIzolatie;
    public  String ecoFredly;
    public String inaltime;

    public Case(String tip, int numareDeEtaje, String numarDeCamere, String tipDeIzolatie) {
        this.tip = tip;
        this.numareDeEtaje = numareDeEtaje;
        this.numarDeCamere = numarDeCamere;
        this.tipDeIzolatie = tipDeIzolatie;
    }

//    public Case(String tip, int numareDeEtaje, String numarDeCamere, String tipDeIzolatie, String ecoFredly, String inaltime) {
//        this.tip = tip;
//        this.numareDeEtaje = numareDeEtaje;
//        this.numarDeCamere = numarDeCamere;
//        this.tipDeIzolatie = tipDeIzolatie;
//        this.ecoFredly = ecoFredly;
//        this.inaltime = inaltime;
//    }
public Case(String tip, int numareDeEtaje, String numarDeCamere, String tipDeIzolatie, String ecoFredly, String inaltime) {
   this(tip, numareDeEtaje, numarDeCamere, tipDeIzolatie);
    this.ecoFredly = ecoFredly;
    this.inaltime = inaltime;
}

    public void caracteristiciCasa (){
        System.out.println("Tipul de casa este " + tip);
        System.out.println("Numar de etaje este " + numareDeEtaje);
        System.out.println("Numarul de case  este " + numarDeCamere);
        System.out.println("Tipul de izolatie este " + tipDeIzolatie);
        if (ecoFredly!=null){
            System.out.println("Este casa ecoFrendly " + ecoFredly);
        }
        else System.out.println("Nu se stie daca este ecoFredly");

        if (inaltime!=null){
            System.out.println("Este casa de " + inaltime);
        }
        else System.out.println("Nu se stie inaltimea");
    }
}
