package ws2021.section_d;

import java.util.Scanner;

public class Diagonale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        

        while(num % 2 == 0 || num <1) {
            System.out.printf(": ");
            num = sc.nextInt();
        }

        sc.close();
        printColumns(num);
    }

    private static void printColumns(int num) {
        for(int i=0; i<num; i++){
            printRow(num, i);
            System.out.printf("\n");
        }
    }

    public static void printRow(int num, int star) {
        for (int i = 0; i<num; i++) {

            int positionRight = num-star-1;
            if(i == star){
                System.out.printf("*");
                continue;
            }
            if (i == positionRight){
                System.out.printf("*");
                continue;
            }
            System.out.printf("-");
        }
    }
    
}
