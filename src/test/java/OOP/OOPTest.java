package OOP;

import org.testng.annotations.Test;

public class OOPTest {
    @Test
    public  void methondaStudent(){
          Student Cristi=new Student("Pop", "Cristi", "34", "Drept", "3", true);
        //Cristi.mergeLaCafea();
       //   Cristi.infoStudent();
      //  Cristi.mananca();

        Angajat Tudor=new Angajat("Chindris", "Tudor", "45", "Endava", "IT", "26");
       // Tudor.mergeLaMunca();
        Tudor.infoAngajat();

//        Persoana radu=new Persoana("Radu", "Chindris", "45");
//        radu.infoPersoana();

     //   Tudor.promovare();
    //    Tudor.mananca();
        Tudor.marire();
        Tudor.marire("Consulting");
        Tudor.marire(44);
        AngajatStudent Radu=new AngajatStudent("Chindris", "Radu", "34", "Endava", "14 ani", "32",
                "Info", "4", true );
       // Radu.

    }


}
