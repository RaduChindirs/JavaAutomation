package OOP.Abstractizare.ClaseAbstracte;

import org.testng.annotations.Test;

public class OOPAbstractizareTest {
    @Test
    public void methondaTest() {
        Cerc formaCerc = new Cerc();
        formaCerc.setRaza(5);
        formaCerc.calculArie();

        Patrat formaPatrat=new Patrat();
        formaPatrat.setLatura(6);
        formaPatrat.calculArie();


    }


}
