package OOP.Abstractizare.Interfete;

public class PatratInterfata implements FormeGeometriceInterfata{
    private int latura;
    @Override
    public void CalculeazaAria() {
        System.out.println("Aria patraturuli este " + latura*latura);
    }

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }

    @Override
    public void Deseneaza() {
        System.out.println("Deseneaza patrat");
    }
}
