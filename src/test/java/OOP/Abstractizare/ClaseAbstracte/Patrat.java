package OOP.Abstractizare.ClaseAbstracte;

public class Patrat extends FormeGeometrice {
   private int latura;
    @Override
    public void calculArie() {
        System.out.println("Aria patraturuli este " + latura*latura);
    }

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }
}
