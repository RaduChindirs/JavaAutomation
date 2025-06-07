package OOP.Abstractizare.Interfete;


import org.testng.annotations.Test;

public class OOPAbstractizareInterfataTest {
    @Test
    public void methondaTest() {
        CercInterfata formaCerc = new CercInterfata();
        formaCerc.setRaza(5);
        formaCerc.CalculeazaAria();

        PatratInterfata formaPatrat=new PatratInterfata();
        formaPatrat.setLatura(6);
        formaPatrat.CalculeazaAria();


    }
}
