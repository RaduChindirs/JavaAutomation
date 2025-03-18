package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
        //citireNote();
        // printareValoriWhile();
        //printareValoreDoWhile();
        // printareValoriFor();
        //checkNumber();
        //ziuaSaptamanii();
        // calculator();
        //firstPozitiveNumber();
        //  skipNegativeNumber();
        //skipNegativenumber2 ();
        //   Radu1();
        //animals();
        //game();
        //Radu2();
        //firstPozitiveDivizor();

        //game4();
        //semafor6();
       // calculeRadu();

    }

    public static void citireNote() {
        System.out.println("Introdu o nota");
        Scanner scaner = new Scanner(System.in);
        int nota = scaner.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10. Te rog introdu o valoare valida");
            nota = scaner.nextInt();
        }
        System.out.println("Nota " + nota + " este intre 1 si 10");

    }

    public static void printareValoriWhile() {
        int valoare = 6;
        while (valoare <= 5) {
            System.out.println("Valoare " + valoare);
            valoare++;
        }
        System.out.println("Valoarea dupa parcurgere de While este " + valoare);
    }

    public static void printareValoreDoWhile() {
        int valoare = 6;
        do {
            System.out.println("Valoarea este " + valoare);
            valoare++;
        } while (valoare <= 5);
        System.out.println("Valoarea dupa parcurgere de Do-While este " + valoare);
    }

    public static void printareValoriFor() {
        // int valoare = 1;
        for (int valoare = 1; valoare <= 10; valoare++) {
            System.out.println("Valoarea aste " + valoare);
        }
    }

    //    Operators
//    Exercitiu 2
//    Modulus Magic: Write a Java program that checks if a number (input from the user)
//    is even or odd without using any conditional statements
//    (hint: use the modulus operator).
    public static void checkNumber6() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Introdu un numar");

        Integer numar = scaner.nextInt();
        // Re-check parity every time
        boolean numarPar = (numar % 2 == 0);

        if (numarPar) {
            System.out.println("numarul este par");
        } else {
            System.out.println("numarul este impar");
        }
    }

    //    Switch
//     Exercitiu 1
//    Day of the Week: Write a Java program that asks the user
//    for a number (1-7) and prints the day of the week corresponding
//    to that number using a switch statement (1 for Monday, 2 for Tuesday, etc.)
    public static void ziuaSaptamanii() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Intodu un numar de la 1 la 7");
        Integer zi = scaner.nextInt();
        switch (zi) {
            case 1:
                System.out.println("Azi este Luni");
                break;
            case 2:
                System.out.println("Azi este Marti");
                break;
            case 3:
                System.out.println("Azi este Miercuri");
                break;
            case 4:
                System.out.println("Azi este Joi");
                break;
            case 5:
                System.out.println("Azi este Vineri");
                break;
            case 6:
                System.out.println("Azi este Sambata");
                break;
            case 7:
                System.out.println("Azi este Duminica");
                break;
            default:
                System.out.println("Zi invalida");
        }

    }

    public static void calculator() {
        Scanner scaner = new Scanner(System.in);
        int rezultatNumere;

        System.out.println("Introdu numarul A");
        int numarA = scaner.nextInt();

        System.out.println("Selecteaza un operator +, -, *, /");
        String operator = scaner.next();

        System.out.println("Introdu numarul B");
        int numarB = scaner.nextInt();

        switch (operator) {
            case "+":
                rezultatNumere = numarA + numarB;
                System.out.println("Rezultat: " + numarA + " + " + numarB + " = " + rezultatNumere);
                break;
            case "-":
                rezultatNumere = numarA - numarB;
                System.out.println("Rezultat: " + numarA + " - " + numarB + " = " + rezultatNumere);
                break;
            case "*":
                rezultatNumere = numarA * numarB;
                System.out.println("Rezultat: " + numarA + " * " + numarB + " = " + rezultatNumere);
                break;
            case "/":
                rezultatNumere = numarA / numarB;
                System.out.println("Rezultat: " + numarA + " / " + numarB + " = " + rezultatNumere);
                break;
        }
    }

    //    Break and Continue
//    Exercitiu 1
//    Find the First Positive Divisor:
//    Write a Java program that finds the first positive divisor (other than 1) of a number entered by the user.
//    Use a loop and a break statement when the divisor is found.

    public static void firstPozitiveNumber3() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Intordu un numar");

        while (true) {
            Integer numar = scaner.nextInt();
            if (numar % 2 != 0) {
                System.out.println("Nuamrul nu este divizibil cu 2");

            } else if (numar % 2 == 0) {
                System.out.println("First pozitive divizor " + numar);
                break;
            }
        }

    }

    //    Break and Continue
//    Exercitiu 2
//    Skip Negative Numbers:
//    Create a program that sums up numbers entered by the user until the user enters 0.
//    Use a continue statement to skip any negative numbers and print the final sum.
    public static void skipNegativeNumber() {
        Scanner scanner = new Scanner(System.in);
        int totalSum = 0;

        while (true) {
            System.out.println("Introdu un numar");
            Integer numar = scanner.nextInt();
            if (numar == 0) {
                break;
            }
            if (numar < 0) {
                continue;
            }
            totalSum += numar;
        }
        System.out.println("The final sum of non-negative numbers is: " + totalSum);
        scanner.close();
    }


    //    Exercitiu 2
//    Guess the Number Game:
//    Implement a simple "guess the number" game where the program randomly selects a number between 1 and 10,
//    and the user has a maximum of 5 attempts to guess it.
//    se a loop with a break statement to end the game if the user guesses correctly or uses up all attempts.
    public static void Radu1() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Randomly generate a number between 1 and 10 (inclusive)
        int numberToGuess = random.nextInt(10) + 1;
        int maxAttempts = 5;
        int userGuess = 0;

        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("You have " + maxAttempts + " attempts to guess it correctly!");

        // Use a for-loop to allow up to 5 guesses
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess -> ");
            userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;  // Exit the loop if guessed correctly
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
            // If user still hasn't guessed after the last attempt, the loop will end
        }

        // After the loop, check if the guess was correct
        if (userGuess != numberToGuess) {
            System.out.println("Sorry! The number I was thinking of was: " + numberToGuess);
        }

        scanner.close();
    }


//    De stersssssssssssssssssssssssssssssssssss






    public static void calculator2() {
        Scanner scaner = new Scanner(System.in);
        while (true) {
            System.out.println("Iroudu un an");
            int year = scaner.nextInt();
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {

                    }
                }
                System.out.println("It is a leep year");
            } else {
                System.out.println("Is not a leap year");
            }
            System.out.println("Incercare noua");
        }
    }


//    boolean isLeapYear = false;
//
//        if (year % 4 == 0) {
//        if (year % 100 == 0) {
//            if (year % 400 == 0) {
//                isLeapYear = true;  // Divisible by 400 → Leap year
//            }
//        } else {
//            isLeapYear = true;  // Divisible by 4 but not by 100 → Leap year
//        }
//    }
//
//    // Display result
//        if (isLeapYear) {
//        System.out.println(year + " is a Leap Year.");
//    } else {
//        System.out.println(year + " is NOT a Leap Year.");


}

