package VariabileMetode;

import org.testng.annotations.Test;

import java.util.Scanner;
@Test
public class While {
    public void Test (){
      citireNote();
    }
    public void citireNote()
    {
        System.out.println("Introdu o nota");
        Scanner scaner=new Scanner(System.in);
        int nota=scaner.nextInt();
        while (nota<0 || nota>10 )
        {
            System.out.println("Nota " + nota + "trebuie sa fie intre 1 si 10. Te rog introdu o valoare valida");
            nota = scaner.nextInt();
        }
        System.out.println("Nota " + nota + "este intre 1 si 10");

    }


}
