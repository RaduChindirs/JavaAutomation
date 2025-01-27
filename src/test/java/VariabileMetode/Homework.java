package VariabileMetode;

import org.testng.annotations.Test;

import java.util.*;

public class Homework {

    @Test
    public static void Test() {
//       perimetruDreptunghi(3, 9);
//        convertTime(10);
//        ariaPatrat(6);
//        volumeOfCylinder(2.2, 5.8);
//        convertesteTemperatura(125.4);
//        calculIpotenuza(4.5, 8.4);
//        comparareDouaNumere(7, 8);
//        comparareDouaNumere(15, 9);
//        comparareDouaNumere(78, 78);
//        printBooleanValue();
//        weatherCondition(true, true, true);
//        weatherCondition(true, true, false);
//        weatherCondition(false, true, false);
//        weatherCondition(false, true, true);
//        weatherCondition(false, false, false);
//        printCharacter('M');
//        convertCharacter();
//        concatenateCharacter();
//        string();
//        concatenateTwoStrings();
//        replaceCharacter();
//        operatiiMatematice(16,8);
//        compondAssignments();
//        score();
//        score2();
//        passwordChecker();
//        isLeapYear(2024);
        //       calculator();
//        traficLifght2("rosu");
//        traficLifght2("galben");
//        traficLifght2("verde");
//        traficLifght2("albastru");

        //      trafficLight("rosu");
//        trafficLight("verde");
//        trafficLight("galben");
//        trafficLight("albastru");
  //      password2();
 //       categoriObiecte();
      //  tablaInmultirii(2);
        tablaInmultiriiEachFor(4);



    }
//    Integer (int) Exercises
//    Exercitiu 1
//    Calculate the Perimeter of a Rectangle:
//    Initialize two integers length and width with any values. Calculate and print the perimeter of a rectangle using these variables
//    public static void perimetruDreptunghi() {
//        Integer latime = 2;
//        Integer lungime = 4;
//        Integer perimetru = latime + latime + lungime + lungime;
//        System.out.println("Perimetru dreptunghiului est :" + perimetru);
//    }

    public static void perimetruDreptunghi(Integer latime, Integer lungime) {
        Integer perimetru = latime + latime + lungime + lungime;
        System.out.println("Perimetrul dreptunghiului este:" + perimetru);
    }

    //    Exercitiu 2
//    Convert Minutes into Seconds:
//    Initialize an integer minutes with any value. Convert this into seconds and print the result.
    public static void convertTime(Integer minutes) {
        Integer convertMinutesInSeconds = minutes * 60;
        System.out.println(minutes + " minute egal cu " + convertMinutesInSeconds + " secunde");
    }

    //    Exercitiu 3
//    Calculate the Area of a Square
//    Initialize an integer side representing the side of a square. Calculate and print the area of the square
    public static void ariaPatrat(Integer latura) {
        Integer ariaPatratCalculata = latura * latura;
        System.out.println("Aria patratului este egala cu  " + ariaPatratCalculata);
    }

    //    Double (double) Exercises
//    Exercitiu 1
//    Calculate the Volume of a Cylinder
//    Initialize two doubles radius and height for a cylinder. Calculate and print the volume of the cylinder (use Math.PI for π).
    public static void volumeOfCylinder(Double radius, Double height) {
        Double volumCilindru = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volumul unui cilindru cu baza de " + radius + " si inaltimea de " + height + " este de " + volumCilindru);
    }

    //    Double (double) Exercises
//    Exercitiu 2
//    Convert Fahrenheit to Celsius
//    Initialize a double Fahrenheit with any value. Convert this to Celsius and print the result.
    public static void convertesteTemperatura(Double fahrenheit) {
        Double celsiusEquivalent = (5.0 / 9.0) * (fahrenheit - 32);
        System.out.println(fahrenheit + " grade fahrenheit egal cu " + celsiusEquivalent + " grade celsius");
    }

    //    Double (double) Exercises
//    Exercitiu 3
//    Calculate the Hypotenuse of a Right-Angled Triangle
//    Given the lengths of the two shorter sides of a right-angled triangle, calculate the length of the hypotenuse.
//    Remember, the hypotenuse of a right-angled triangle can be found using Pythagoras theorem, which states that the square of the hypotenuse is equal to the sum of the squares of the other two sides.
    public static void calculIpotenuza(Double catetaA, Double catetaB) {
        Double ipotenuza = Math.sqrt((catetaA * catetaA) + (catetaB * catetaB));
        System.out.println("Ipotenuza unui triunghi dreptunghic cu cateta A de " + catetaA + " si cateta B egala cu " + catetaB + " este egala cu " + ipotenuza);
    }

    //    Boolean (boolean) Exercises
//    Exercitiu 1
//    Boolean Value Assignment and Printing
//    Create a program that declares a boolean variable, assigns a value to it, and then prints it. This exercise helps you understand how to work with boolean variables.
    public static void printBooleanValue() {
        Boolean incepatorJava = true;
        String numeCursant = "Radu";
        System.out.println("Cursantul " + numeCursant + ", valoarea pt incepatorJava este " + incepatorJava);
    }

    //    Exercitiu 2
//    Boolean Comparison
//    Write a program that compares two integers using relational operators (e.g., <, >, <=, >=) and stores the result in a boolean variable. Then, print the result. This exercise demonstrates how comparison operations result in boolean values.
//    public static void comparareDouaNumere(Integer numarulUnu, Integer numarulDoi) {
//        Boolean verifcare = numarulUnu > numarulDoi;
//        if (verifcare) {
//            System.out.println("Numarul " + numarulUnu + " este mai mare decat " + numarulDoi);
//        } else
//            System.out.println("Numarul " + numarulUnu + " este mai mic " + numarulDoi);
//
//
//
//    }

    public static void comparareDouaNumere(Integer numarulUnu, Integer numarulDoi) {
        Boolean verifcare = numarulUnu > numarulDoi;
        Boolean verifcare2 = numarulUnu < numarulDoi;
        if (verifcare) {
            System.out.println("Numarul " + numarulUnu + " este mai mare decat " + numarulDoi);
        } else if (verifcare2) {
            System.out.println("Numarul " + numarulUnu + " este mai mic " + numarulDoi);
        } else System.out.println("Numerele sunt egale");
    }

//    Exercitiu 3
//    Checking Weather Conditions
//    Write a program to decide if you should go out based on the weather conditions.
//    The decision is based on three factors: if it's sunny, if there's a chance of rain, and if it's warm.
//    You should only go out if it's sunny and warm. However, even if it's not sunny,
//    you might still consider going out if it's warm but only if there's no chance of rain.
//
//    Instructions:
//    Create three boolean variables: isSunny, isWarm, and chanceOfRain.
//    Use logical operators to evaluate the conditions under which you should go out.
//    Store the result in a boolean variable named shouldGoOut.
//    Print the value of shouldGoOut.
//

//    public static void weatherCondition() {
//        Boolean isSunny = false;
//        Boolean isWarm = true;
//        Boolean chanceOfRain = false;
//        if (isSunny && isWarm) {
//            System.out.println(" Mergi la plimare");
//        } else if (!isSunny && isWarm && !chanceOfRain) {
//            System.out.println(" Mergi la plimare");
//        }
//        else System.out.println("Stai in casa");
//
//    }

    public static void weatherCondition(Boolean isSunny, Boolean isWarm, Boolean chanceOfRain) {
        Boolean shouldGo = (isSunny && isWarm) || (!isSunny && isWarm && !chanceOfRain);
        if (shouldGo) {
            System.out.println(" Mergi la plimare");
        } else System.out.println("Stai in casa");
    }
    //   Char (char) Exercises
    //   Exercitiu 3
    //   Print a Character
    //   Create a program that initializes a char variable with a letter, then prints this character.

    public static void printCharacter(Character gen) {
        System.out.println("Genul persoanei este : " + gen + " (M de la masculin su F de la feminin)");

    }
//    Char (char) Exercises
//    Exercitiu 2
//    Convert Case
//    Write a program that converts a lowercase letter to uppercase and vice versa.
//    This exercise does not use conditional statements, so you'll need to use two predefined characters.
//    Concatenate Character with String

    public static void convertCharacter() {
        char letter = 'A';
        char mask = (char) ('a') ^ ('A');      //?
        char converted = (char) (letter ^ mask);  //?
        System.out.println("Original: " + letter);
        System.out.println("Converted: " + converted);
    }
//    Char (char) Exercises
//    Exercitiu 2
//    Concatenate Character with String
//    Create a program that demonstrates how to add a character to both the beginning and end of a string.
//    This exercise will help you understand how characters and strings can be combined to create new string values.
//    Instructions:
//    Initialize a char variable and a String variable.
//    Concatenate the character to the beginning and the end of the string.
//    Print the new concatenated string.

    public static void concatenateCharacter() {
        Character initialaNumeFamilie = 'C';
        String nume = initialaNumeFamilie + "Radu" + initialaNumeFamilie;
        System.out.println("Numele  cu initiala familie la inceput si la sfarsit este :" + nume);

    }

//    String (String) Exercises
//    Exercitiu 1
//    Print a String
//    Write a program that initializes a String variable with a value and prints it.

    public static void string() {
        String nume = "Radu Chindris";
        System.out.println("Nume utilizator program este: " + nume);
    }

//    String (String) Exercises
//    Exercitiu 2
//    Concatenate Two Strings
//    Create a program that concatenates two strings and prints the result.

    public static void concatenateTwoStrings() {
        String nume = "Chindris";
        String prenume = "Radu";
        String numeIntreg = nume + " " + prenume;
        //   String numeIntreg=nume.concat(" ").concat(prenume);
        System.out.println("Numele intreg al utilizatorului este: " + numeIntreg);
    }

//    String (String) Exercises
//    Exercitiu 2
//    Replace Characters
//    Write a program that replaces all occurrences of a specified character in a string with another character.
//        Challenge: Explore Java's built-in methods for various data types.

    public static void replaceCharacter() {
        String litere = "aabcdefabcdef";
        String replaceLetter = litere.replace("a", "x");
        System.out.println("Stringul initial este: " + litere + "." + " Iar noul strig in care inclocuim a cu x este " + replaceLetter);

    }

//    Operators
//    Exercitiu 1
//    Basic Arithmetic Operators: Create a Java program that takes two integers as input
//    and prints their sum, difference, multiplication, and division.
//    Make sure to handle division by zero gracefully.

    public static void operatiiMatematice(Integer numarulUnu, Integer numarulDoi) {

        Integer sumaNumere = numarulUnu + numarulDoi;
        Integer diferentaNumere = Math.subtractExact(numarulUnu, numarulDoi);
        Integer imultireNumere = numarulUnu * numarulDoi;
        Integer impartireNumere = numarulUnu / numarulDoi;
        System.out.println("Suma numarelor: " + numarulUnu + " si " + numarulDoi + " este egala cu " + sumaNumere);
        System.out.println("Diferenta numarelor: " + numarulUnu + " si " + numarulDoi + " este egala cu " + diferentaNumere);
        System.out.println("Inmultirea numarelor: " + numarulUnu + " si " + numarulDoi + " este egala cu " + imultireNumere);
        System.out.println("Impartirea numarelor: " + numarulUnu + " si " + numarulDoi + " este egala cu " + impartireNumere);
    }

//    Operators
//    Exercitiu 2
//    Modulus Magic: Write a Java program that checks if a number (input from the user)
//    is even or odd without using any conditional statements
//    (hint: use the modulus operator).

// REZOLVAT IN MAIN DOAR ACOLO MERGE SCANER


    //    Operators
//    Exercitiu 3
//    Compound Assignment Operators: Create a program that demonstrates the use of compound assignment operators like
//    +=, -=, *=, and /= with some integers. Print the result after each operation to see the effect.
//
    public static void compondAssignments() {
        Integer a = 4;
        Integer b = 10;
        Integer c = 2;
        Integer d = 10;

        a += 7;
        b -= 3;
        c *= 4;
        d /= 2;

        System.out.println("a +=7 (unde a este 4) egal cu: " + a);
        System.out.println("b -=3 (unde b este 10) egal cu: " + b);
        System.out.println("c *=4 (unde c este 2) egal cu: " + c);
        System.out.println("d /=2 (unde d este 10) egal cu: " + d);

    }

//    If Blocks
//    Exercitiu 1
//    Grade Calculator: Write a Java program that takes a score (e.g., 87) as input and assigns a grade based on the score
//    (A for 90 and above, B for 80-89, C for 70-79,
//    D for 60-69, and F for below 60) using if-else blocks. Print the grade.

    public static void score() {
        Integer score = 1587;
        if (score >= 90) {
            System.out.println("The grade for the score " + score + " este A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("The grade for the score " + score + " este B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("The grade for the score " + score + " este C");

        } else if (score >= 60 && score <= 69) {
            System.out.println("The grade for the score " + score + " este D");
        } else if (score >= 0 && score < 60) {
            System.out.println("The grade for the score " + score + " este f");

        } else System.out.println("Score invalid");
    }

    public static void score2() {
        Integer score = -60;
        Boolean ratingA = score >= 90;
        Boolean ratingB = score >= 80 && score <= 89;
        Boolean ratingC = score >= 70 && score <= 79;
        Boolean ratingD = score >= 60 && score <= 69;
        Boolean ratingF = score >= 0 && score < 60;

        if (ratingA) {
            System.out.println("Rating A " + score);
        } else if (ratingB) {
            System.out.println("Rating B " + score);

        } else if (ratingC) {
            System.out.println("Rating C " + score);

        } else if (ratingD) {
            System.out.println("Rating D " + score);

        } else if (ratingF) {
            System.out.println("Rating F " + score);

        } else System.out.println("Invalid number");
    }
//    If Blocks
//    Exercitiu 1
//    Password Checker: Implement a simple password strength checker in Java.
//    If the password length is less than 8 characters, print "Weak Password".
//    If it has 8 or more characters but doesn't contain any number, print "Moderate Password". If it meets both conditions, print "Strong Password".

    public static void passwordChecker() {
        String pass = "12345678";
        Integer nrOfCharacters = pass.length();
        Integer nrOfLetters = 0;
        Integer nrOfDigits = 0;
        for (int i = 0; i < pass.length(); i++) {
            //  pass.charAt(i) gives us the character at the current index i.
            char c = pass.charAt(i);

            if (Character.isLetter(c)) {
                nrOfLetters++;
            } else if (Character.isDigit(c)) {
                nrOfDigits++;
            }

        }
        if (nrOfCharacters >= 0 && nrOfCharacters < 8) {
            System.out.println("Parola slaba, numarul de charactere este " + nrOfCharacters + " , " + " nr minim de charactere necesare este 8");
        } else if (nrOfCharacters >= 8 && nrOfDigits == 0) {
            System.out.println("Parola moderata, nu contine nici un numar ");
        } else if (nrOfCharacters >= 8 && nrOfDigits > 0) {
            System.out.println("Parola puternica, numarul de caractere este " + nrOfCharacters + ", numarul de numere este " + nrOfDigits + ", numarul de litere este " + nrOfLetters);

        }


        //    Password Checker: Implement a simple password strength checker in Java.
//    If the password length is less than 8 characters, print "Weak Password".
//    If it has 8 or more characters but doesn't contain any number, print "Moderate Password". If it meets both conditions, print "Strong Password".


    }

    public static void password2() {
        String parola = "zxcvbn";
        Integer nrLitere = 0;
        Integer nrNumere = 0;
        Integer nrCharacters = parola.length();

        for (Integer i = 0; i < parola.length(); i++) {
            Character c = parola.charAt(i);

            if (Character.isDigit(c)) {
                nrNumere++;
            } else if (Character.isLetter(c)) {
                nrLitere++;


            }

        }
        System.out.println("Numar digits " + nrNumere);
        System.out.println("Numar caractere " + nrLitere);

        if (nrCharacters < 8) {
            System.out.println("Weak Password " + " nr de caractere " + parola.length());
        } else if (nrCharacters >= 8 && nrNumere == 0) {
            System.out.println("Parola moderata, are mai mult de 8 charactere dar nu contine nic un numare");

        } else if (nrCharacters > 8 && nrNumere != 0) {
            System.out.println("Strogn Password");

        }


    }

//    If Blocks
//    Exercitiu 2
//    Leap Year Checker: Write a Java program to check whether a year (input from the user) is a leap year or not.
//    Remember, a leap year is divisible by 4 but not by 100 unless it's also divisible by 400.


//    public static boolean isLeapYear() {
//        Integer year = 2014;
//        // Check the leap year conditions
//        if (year % 400 == 0) {
//            // Case 1: Divisible by 400
//            System.out.println("It is a leap Year");
//            ;
//        } else if (year % 100 == 0) {
//            // Case 2: Divisible by 100 (but not by 400)
//            System.out.println("Is not a leep year");
//            ;
//        } else if (year % 4 == 0) {
//            // Case 3: Divisible by 4 (but not by 100)
//            System.out.println("It is a leep yaar");
//        }
//
//
//    }

    public static boolean isLeapYear(int year) {
        // Check the leap year conditions
        if (year % 400 == 0) {
            // Case 1: Divisible by 400
            return true;
        } else if (year % 100 == 0) {
            // Case 2: Divisible by 100 (but not by 400)
            return false;
        } else if (year % 4 == 0) {
            // Case 3: Divisible by 4 (but not by 100)
            return true;
        } else {
            // Otherwise, not a leap year
            return false;
        }
    }
//    Swich
//     Exercitiu 1
//    Day of the Week: Write a Java program that asks the user
//    for a number (1-7) and prints the day of the week corresponding
//    to that number using a switch statement (1 for Monday, 2 for Tuesday, etc.).

//   !!!!!!!!!!!!!!!!   Works only on main !!!!!!!!!!!!!!!!!!!


//    public static void ziuaSaptamanii() {
//        Scanner scaner = new Scanner(System.in);
//        System.out.println("Intodu un numar de la 1 la 7");
//
//        while (true) {
//            Integer zi = scaner.nextInt();
//            switch (zi) {
//                case 1:
//                    System.out.println("Azi este Luni");
//                    break;
//                case 2:
//                    System.out.println("Azi este Marti");
//                    break;
//                case 3:
//                    System.out.println("Azi este Miercuri");
//                    break;
//                case 4:
//                    System.out.println("Azi este Joi");
//                    break;
//                case 5:
//                    System.out.println("Azi este Vineri");
//                    break;
//                case 6:
//                    System.out.println("Azi este Sambata");
//                    break;
//                case 7:
//                    System.out.println("Azi este Duminica");
//                    break;
//                default:
//                    System.out.println("Zi invalida");
//            }
//        }
//    }


//    Swich
//     Exercitiu 2
//    Simple Calculator: Create a Java program that acts as a simple calculator.
//    The program should take three inputs: two numbers and an operator (+, -, *, /) and perform the operation using a switch statement.

// !!!!!!!!!! Work only on Main !!!!!!!!!!!!!!!!!!!

    //public static void calculator() {
//    Scanner scanner = new Scanner(System.in);
//    while (true) {
//        System.out.println("Intordu numarul unu");
//        Integer numarul1 = scanner.nextInt();
//        System.out.println("Intorodu numarul doi");
//        Integer numarul2 = scanner.nextInt();
//
//        System.out.println("Enter an operator (+, -, *, /): ");
//        Character operator = scanner.next().charAt(0);
//
//        Integer rezultat = 0;
//
//        switch (operator) {
//            case '+':
//                rezultat = numarul1 + numarul2;
//                System.out.println("rezultatul este " + rezultat);
//                break;
//            case '-':
//                rezultat = numarul1 - numarul2;
//                System.out.println("rezultatul este " + rezultat);
//                break;
//            case '*':
//                rezultat = numarul1 * numarul2;
//                System.out.println("rezultatul este " + rezultat);
//                break;
//            case '/':
//                rezultat = numarul1 / numarul2;
//                System.out.println("rezultatul este " + rezultat);
//                break;
//            default:
//                System.out.println("Operator gresit ");
//
//        }
//
//
//    }
//}
//  Swich
//  Exercitiu 1
//    Traffic Light Simulator: Simulate a traffic light using a switch statement.
//    The user inputs one of three colors (red, yellow, green),
//    and the program prints out what a driver should do (e.g., "Stop" for red).

    public static void trafficLight(String culoareSemafor) {

        switch (culoareSemafor) {
            case "rosu":
                System.out.println("Stai pe loc, nu trece semaforul este de culorare " + culoareSemafor);
                break;
            case "verde":
                System.out.println("Poti trece semaforul este de culorare " + culoareSemafor);
                break;
            case "galben":
                System.out.println("Stai pe loc, nu trece semaforul este de culorare " + culoareSemafor + " asteapta culoarea verde");
                break;
            default:
                System.out.println("Culorare invalida");

        }
    }

    //    Break and Continue
//    Exercitiu 1
//    Find the First Positive Divisor:
//    Write a Java program that finds the first positive divisor (other than 1) of a number entered by the user.
//    Use a loop and a break statement when the divisor is found.

    // !!!!!!!!!! Work only on Main !!!!!!!!!!!!!!!!!!!

//    public static void firstPozitiveNumber() {
//        Scanner scaner = new Scanner(System.in);
//        System.out.println("Intordu un numar");
//
//        while (true) {
//            Integer numar = scaner.nextInt();
//            if (numar % 2 != 0) {
//                System.out.println("Nuamrul nu este divizibil cu 2");
//
//            } else if (numar % 2 == 0) {
//                System.out.println("First pozitive divizor " + numar);
//                break;
//            }
//        }
//
//    }


//    Break and Continue
//    Exercitiu 2
//    Skip Negative Numbers:
//    Create a program that sums up numbers entered by the user until the user enters 0.
//    Use a continue statement to skip any negative numbers and print the final sum.

    // !!!!!!!!!! Work only on Main !!!!!!!!!!!!!!!!!!!

//    public static void skipNegativeNumber() {
//        Scanner scanner = new Scanner(System.in);
//        int totalSum=0;
//
//        while (true){
//            System.out.println("Introdu un numar");
//            Integer numar= scanner.nextInt();
//            if (numar==0){
//                break;
//
//            }
//            if (numar<0){
//                continue;
//            }
//            totalSum+=numar;
//        }
//        System.out.println("The final sum of non-negative numbers is: " + totalSum);
//        scanner.close();
//
//    }

//    Break and Continue
//    Exercitiu 2
//    Guess the Number Game:
//    Implement a simple "guess the number" game where the program randomly selects a number between 1 and 10,
//    and the user has a maximum of 5 attempts to guess it.
//    se a loop with a break statement to end the game if the user guesses correctly or uses up all attempts.

    // !!!!!!!!!! Work only on Main !!!!!!!!!!!!!!!!!!!

//    public static void numberGame() {
//        Scanner scaner = new Scanner(System.in);
//        Random randome = new Random();
//
//        int maxAttempt = 5;
//        int nrToGuess = randome.nextInt(10) + 1;
//        int userGues = 0;
//        System.out.println("Trebuie sa ghicesti un nr de la 1 la 10");
//        System.out.println("Numarul maxim de incercari este " + maxAttempt);
//        for (int attepts = 1; attepts <= maxAttempt; attepts++) {
//            System.out.println("Incercare nr " + attepts);
//            userGues = scaner.nextInt();
//
//            if (userGues == nrToGuess) {
//                System.out.println("Ai ghicit numarul, nr correct era  " + nrToGuess);
//                break;
//            } else if (userGues < nrToGuess) {
//                System.out.println("To low");
//            } else System.out.println("Nr to High");
//
//        }
//        if (userGues != nrToGuess)
//            System.out.println("Nu ai ghicit numarul, nr corect era  " + nrToGuess);
//
//    }
    //    If Blocks
//    Exercitiu 1
//    Password Checker: Implement a simple password strength checker in Java.
//    If the password length is less than 8 characters, print "Weak Password".
//    If it has 8 or more characters but doesn't contain any number, print "Moderate Password". If it meets both conditions, print "Strong Password".


    //        For-Each Loop
//        Multiplication Table: Write a Java program that prints out the multiplication table for a number up to 10.
//        For example, if the user inputs 3, your program should print the multiplication table
//        for 3 (3 x 1 = 3, 3 x 2 = 6, ..., 3 x 10 = 30) using a for loop.


    public  static void tablaInmultirii (Integer numar){
        for (int i=0; i<=10; i++){
            System.out.println("Tbla inmultirii cu  " + numar + ", "+ i +" * " + numar + " = "  + i*numar);
        }

    }

    public static void tablaInmultiriiEachFor (int nrUser){
        int [] range = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Taba inmultirii pt numarul " +nrUser);

        for (int i :range){
            System.out.println(nrUser + "*" + i + " = " + nrUser*i);
        }

    }

}
