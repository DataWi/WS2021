package ws2021.section_c;

import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {
        String result="kein";

        Scanner sc = new Scanner(System.in);
        System.out.printf("Bitte Jahr eingeben: ");
        int year = sc.nextInt();
        sc.close();

        if(year%4 == 0) {
            result = "ein";
            if(year%100 == 0){
                result = "kein";
            }
            if(year%400 == 0){
                result="ein";
            }
        }

        System.out.printf("Das Jahr %d ist %s Schaltjahr.", year, result);
    }
}
