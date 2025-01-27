package VariabileMetode;

import org.testng.annotations.Test;

public class Student {

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Adresa;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public String AreDiploma;
    public String Nationalitate;

    @Test
    public void prezentareStudent() {
        Nume = "Chindris";
        Prenume = "Radu";
        Varsta = 44;
        Adresa = "Strada Florilor";
        Inaltime = 1.8;
        Greutate = 9.10f;
        Sex = 'M';
        AreDiploma = "True";

        //Intr-o singura linie mai multe variabile cu valori
        System.out.println("Numele studentului este " + Nume + "." + " Prenumele studentului este " + Prenume + " si are varsta " + Varsta + ".");

        // Print si Println. Print afiseaza intr-o singura linie mai multe variabile
        System.out.print("Numele studentului este: " + Nume + ". ");
        System.out.println("Prenumele studetunlui este: " + Prenume);

        // Fiecare linie afisata pe linie diferita
        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Prenumele studentului este: " + Prenume);
        System.out.println("Varsta studentului este: " + Inaltime);
        System.out.println("Greutatea studentului: " + Greutate);
        System.out.println("Sexul studentului este: " + Sex);
        System.out.println("Are studentul diploma: " + AreDiploma);

        calculMedie();
        System.out.println(getSalariu());

    }

    public void calculMedie() {
        //Variabile declarate local, sunt vizibile doar in aceasta metoda
        Integer nota1 = 8;
        Integer nota2 = 9;
        Integer nota3 = 10;
        Integer medie = (nota1 + nota2 + nota3) / 3;

        System.out.println("Media studentului este: " + medie);
    }

    //Metoda cu return
    public Integer getSalariu() {
        Integer Salariu = 34421;
        // TODO
        return Salariu;
    }

}
