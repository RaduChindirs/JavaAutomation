package VariabileMetode;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Masina {
    public String marca;
    public String model;
    public Integer anFabricatie;

@Test
public  void  metodaTest(){
//    dateMasina("Audi", "Q7",2023 );
//    dateMasina("BMV", "X5",2026 );
//    calculMedie(4.5, 8.7);
//    calculMedie(8.4, 9.7);


}

    public  void dateMasina(String param1, String param2, Integer param3){

        marca=param1;
        model=param2;
        anFabricatie=param3;
        System.out.println("Marca masinii este: " +marca);
        System.out.println("Modelu masinii este: " +model);
        System.out.println("Anuld de fabiricare al masinii este: " +anFabricatie);

    }

    //Calculam media la doua numere
    public void calculMedie (Double nota1, Double nota2) {
        Double rezultat = (nota1 + nota2) / 2;
        System.out.println("Media celor doua numere este: " + rezultat);
    }





    }

