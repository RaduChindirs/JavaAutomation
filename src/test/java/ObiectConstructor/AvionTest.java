package ObiectConstructor;

import org.testng.annotations.Test;

public class AvionTest {
    @Test
    public void metotdaTest() {

        Avion avion1 = new Avion("Pasageri", "Boeing", "B-123", "260", "Cherosen");
        avion1.prezentareAvion();

        Avion avion2 = new Avion("Marfa", "Boeing", "B-98", "562", "Cherosen");
        avion2.prezentareAvion();

        Avion avion3 = new Avion("Marfa si pasageri", "Boeing", "B-5498", "20", "Cherosen",23);
        avion3.prezentareAvion();
    }
}
