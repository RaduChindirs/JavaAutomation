package OOP;

public class Persoana {

    private String nume;
    private String prenume;
    private String varsta;

    public Persoana(String nume, String prenume, String varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public  void infoPersoana(){
        System.out.println("Numele este " + nume);
        System.out.println("Prenumele este " + prenume);
        System.out.println("Varsta este " + varsta);
    }
    // Definim prima implementare pt o metoda (polimorfism dinamic)
    public void mananca (){
        System.out.println("Persoana mananca cand ii este foame");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }
}
