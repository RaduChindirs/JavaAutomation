package Exceptii;

public class Exceptia1 {
    public static void main(String[] args) throws ExceptionCustom {
        //  System.out.println(12/0);
//        try {
//            System.out.println(12/0);
//        } catch (ArithmeticException e){
//            System.out.println("Error Arithment exception thrown " +e.getMessage());
//        }
        try {
            int[] numbers = new int[10];
            numbers[11] = 5; // pt ca lista e pana la 10 si s-a introdus nr 11 apare error de out of bounds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
         //   System.out.println(e.getMessage());
            throw new ExceptionCustom("Erroare personalizata");
        }finally {
            System.out.println("Aceasta linie se executa indiferent daca exceptia este prinsa");
        }

    }
}
