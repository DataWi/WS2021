package ws2021.section_b;

import java.util.Scanner;

public class Zahlendreher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Zahl: ");
        int number = sc.nextInt();
        sc.close();


        int firstNumber = number /100;
        int secondNumber = (number /10)%10;
        int thirdNumber = number %10;

        System.out.printf("Ausgabe: %01d%01d%01d",thirdNumber,secondNumber,firstNumber);
    }
}
