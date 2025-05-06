package RaduExercitii;

import org.testng.annotations.Test;

public class CaseTest {
    @Test
    public  void prezentareCasa(){
        Case case1=new Case("Publica", 3, "5", "Vata bazaltica");
        case1.caracteristiciCasa();
        Case case2=new Case("Privata", 3, "5", "Vata bazaltica", "Da", "14");
        case2.caracteristiciCasa();
    }
}
