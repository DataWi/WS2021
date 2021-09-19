package ws2021.section_b;

import java.util.Scanner;
public class Oktal {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Oktalzahl eingeben: ");
        int octal = sc.nextInt();
        sc.close();

        // Über Modulo und division die einzelnen Stellen evaluieren
        int firstNumber = octal /100;
        int secondNumber = (octal /10)%10;
        int thirdNumber = octal %10;

        int decimal = firstNumber*8*8+secondNumber*8+thirdNumber;

       int sum = decimal/100 + decimal %10 +(decimal /10)%10;




        System.out.printf("dezimal: %d\n", decimal);
        System.out.printf("Ziffernsumme: %d", sum);
    }




}
