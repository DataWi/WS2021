package ws2021.section_b;

import java.util.Scanner;

public class Timecalculator {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Welcome to the TimeCalculator!\n");
        System.out.printf("please enter a duration in milliseconds:");
        long ms = sc.nextLong();
        sc.close();

        // Aufspalten der Zahl
        long milliseconds = ms%1000;
        long seconds = ms / 1000;
        long minutes = seconds/60;
        long hours = minutes/60;
        long days = hours/24;


        System.out.printf("%d ms are exactly:\n",ms);
        System.out.printf("%7s %d\n","days", days);
        System.out.printf("%7s %d\n","hours", hours%24);
        System.out.printf("%7s %d\n", "minutes", minutes%60);
        System.out.printf("%7s %d\n","seconds", seconds%60);
        System.out.printf("%7s %d\n","ms", milliseconds);
    }
}
