package ObiectConstructor;

public class Avion {
    public String tip;
    public String marca;
    public String model;
    public String capacitatePasageri;
    public String tipCombustibil;
    public Integer numarBagaje;

    public Avion(String tip, String marca, String model, String capacitatePasageri, String tipCombustibil) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
    }

    public Avion(String tip, String marca, String model, String capacitatePasageri, String tipCombustibil, Integer numarBagaje) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
        this.numarBagaje = numarBagaje;
    }

    public void prezentareAvion(){
        System.out.println("Tipul avionului este " + tip);
        System.out.println("Marca avionului este " + marca);
        System.out.println("Model avionului este " + model);
        System.out.println("Capacitate avionului este " + capacitatePasageri);
        System.out.println("Tip combustibil avionului este " + tipCombustibil);
        if (numarBagaje!=null){
            System.out.println("Numar bagaje" + numarBagaje);
        }
        else {
            System.out.println("Avionul nu are bagaje");
        }
    }

}
