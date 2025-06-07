package OOP.Abstractizare.Interfete;

import OOP.Abstractizare.ClaseAbstracte.FormeGeometrice;

public class CercInterfata implements FormeGeometriceInterfata{
    private int raza;


    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    @Override
    public void Deseneaza() {
        System.out.println("Deseneaza cerc");
    }

    @Override
    public void CalculeazaAria() {
        System.out.println("Aria cercului este egala cu " + Math.PI * Math.pow(raza, 2));
    }
}
