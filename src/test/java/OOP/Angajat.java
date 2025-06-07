package OOP;

public class Angajat extends Persoana implements AngajatInt {
private String firma;
private String experienta;
private String zileConcediu;
    public Angajat(String nume, String prenume, String varsta, String firma, String experienta, String zileConcediu) {
        super(nume, prenume, varsta);
        this.firma=firma;
        this.experienta=experienta;
        this.zileConcediu=zileConcediu;

    }
     public void infoAngajat(){
         infoPersoana();
         System.out.println("Firmal la care lucreaza persona este " + firma);
         System.out.println("Experienta persoanei este in  " + experienta);
         System.out.println("Numar zile concediu " + zileConcediu);
     }

     // suprascriem metoda din partinte polimorfismul dinamic
    public  void mananca (){
        System.out.println("Angajatul manca cand are pauza de masa");
    }
    // polimorfismul static
    public void marire (){
        System.out.println("Nu avem buget de marire");
    }

    public void marire (Integer procent){
        System.out.println("Angajatul a primit o marire cu procentul " + procent + "%");
    }

    public void marire (String grade){
        System.out.println("Angajatul a primit gradul de " + grade);
    }

     public void promovare (){
         System.out.println("angajatul cu numel " + getNume() + "a fost promovat");
     }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getExperienta() {
        return experienta;
    }

    public void setExperienta(String experienta) {
        this.experienta = experienta;
    }

    public String getZileConcediu() {
        return zileConcediu;
    }

    public void setZileConcediu(String zileConcediu) {
        this.zileConcediu = zileConcediu;
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Angajatul merge la munca");
    }

    @Override
    public void primesteSalar() {
        System.out.println("Angajatul primeste salariu");
    }

    @Override
    public void mergeInPauza() {
        System.out.println("Angajatul ea pauza");
    }

    @Override
    public void prezintaDemisie() {
        System.out.println("Angajatul nu pleaca din firma");
    }
}
