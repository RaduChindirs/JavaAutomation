package VariabileMetode;

import org.testng.annotations.Test;

public class StructuriAlternative {

    @Test
    public void metodaTest() {
//     metodaVerificareNumar(7);
//     metodaVerificareNumar(3);
//     metodaVerificareNumar(5);
        metodaVerificareParPozitiv(0);
        metodaVerificareParPozitiv(4);
        metodaVerificareParPozitiv(3);
        metodaVerificareParPozitiv(-4);
        metodaVerificareParPozitiv(-5);
        zileSaptamana(3);
    }

    //Verificam un numar mai mare decat 5
    public void metodaVerificareNumar(int valoare) {
        if (valoare > 5) {
            System.out.println("Numarul " + valoare + " este mai mare decat 5");
        } else if (valoare < 5) {
            System.out.println("Numarul " + valoare + " este mai mic decat 5");
        } else {
            System.out.println("Numarul " + valoare + " este egal cu 5");
        }
    }

    //Verificam daca un numar este par pozitiv sau par negativ
    public void metodaVerificareParPozitiv(int valoare) {
        if (valoare > 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par pozitiv");
            } else {
                System.out.println("Numarul " + valoare + " este impar pozitiv");
            }
        } else if (valoare < 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par negative");
            } else {
                System.out.println("Numarul " + valoare + "  este impar negative");
            }
        } else {
            System.out.println("Numarul " + valoare + " este zero");
        }
    }

    //exemplu swich case
    public void zileSaptamana(Integer zi) {
        switch (zi) {
            case 1:
                System.out.println("Azi este luni");
                break;
            case 2:
                System.out.println("Azi este marti");
                break;
            case 3:
                System.out.println("Azi este miercuri");
                break;
            case 4:
                System.out.println("Azi este joi");
            default:
                System.out.println("Zi invalida");
        }
    }
}
