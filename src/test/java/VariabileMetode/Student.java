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

    @Test

    public void prezentareStudent() {
        Nume = "Chindirs";
        Prenume = "Radu";
        Varsta = 44;
        Adresa = "Strad Florilor";
        Inaltime = 1.8;
        Greutate = 9.10f;
        Sex = 'M';
        AreDiploma = "True";

                //Intr-o singur linie mai multe variabile cu valori
       System.out.println("Numele studetului este " + Nume + "." + " Prenumele studetului este " + Prenume + " si are varsta " + Varsta + ".");

                // Print si Println. Print afisaaza intr-o singur linie mai multe variabile
       System.out.print("Nume studentului este: " + Nume + ". ");
       System.out.println("Prenumele studetului este: " + Prenume);

               // Fiecare linie afisata pe linie diferita
        System.out.println("Nume studentului este: " + Nume);
        System.out.println("Prenumele studetului este: " + Prenume);
        System.out.println("Varsta studetului este: " + Inaltime);
        System.out.println("Greutatea studetu: " + Greutate);
        System.out.println("Sexul studetului este: " + Sex);
        System.out.println("Are studetul diploma: " + AreDiploma);

        calculMedie();

    }

    public void calculMedie (){
           //Variabile declarate local, sunt vizibile doar in aceasta metoda
        Integer nota1=8;
        Integer nota2=9;
        Integer nota3=10;
        Integer medie=(nota1 + nota2 + nota3)/3;

        System.out.println("Media studetului est: " + medie);
    }
}
