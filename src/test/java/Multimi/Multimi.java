package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {
    @Test
    public void Test() {
        //colegiCurs();
        // colegiLista();
        // categoriiObiecte();
        //  tariiOrase();
        //   colegiCurs2();
        //   colegiLista2();
        //   categoriiObiecte2();
       // forEach();
        tariiOrase();
    }

    //exemplu array
    public void colegiCurs() {
        String[] colegi = new String[6];
        colegi[0] = "Ana-Maria";
        colegi[1] = "Radu";
        colegi[2] = "Cosmin";
        colegi[3] = "Aida";
        colegi[4] = "Bogdan";
        colegi[5] = "Alex";
        //  for (int index = 0; index < 6; index++) {
        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Numele colegului este " + colegi[index]);
        }
    }

    // exemplu lista
    public void colegiLista() {
        List<String> colegiCursLista = new ArrayList<>();
        colegiCursLista.add("Ana Maria");
        colegiCursLista.add("Radu");
        colegiCursLista.add("Abiel");
        colegiCursLista.add("Cosmin");
        colegiCursLista.add("Andrei");
        colegiCursLista.add("Bob");
        int index = 0;
        while (index < colegiCursLista.size()) {
            System.out.println("Numele colegului este " + colegiCursLista.get(index));
            index++;


        }
    }

    //exmplu Map
    public void categoriiObiecte() {
        HashMap<String, String> obiecte = new HashMap<>();
        obiecte.put("Obiect", "laptop");
        obiecte.put("Fruct", "Mar");
        obiecte.put("Floare", "trandafir");
        for (String key : obiecte.keySet()) { // For- ech pt fiecare lista din lista de chei
            System.out.println("Keia este: " + key);
            System.out.println("Valoarea este: " + obiecte.get(key));
        }
    }

    public void tariiOrase() {
        HashMap<String, List<String>> clasificare = new HashMap<>();

        List<String> oraseRomanie = new ArrayList<>();
        oraseRomanie.add("Cluj");
        oraseRomanie.add("Sibiu");
        oraseRomanie.add("Oradea");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Napoli");
        oraseItalia.add("Florenta");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madird");
        oraseSpania.add("Malaga");

        clasificare.put("Romania", oraseRomanie);
        clasificare.put("Italia", oraseItalia);
        clasificare.put("Spania", oraseSpania);

        for (String key : clasificare.keySet()) {
            System.out.println("Tara este: " + key);
            System.out.println("Orasele  sunt: " + clasificare.get(key));
        }

    }



}
