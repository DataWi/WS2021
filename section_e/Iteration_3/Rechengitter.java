package ws2021.section_e.Iteration_3;

import java.util.Scanner;

public class Rechengitter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Anzahl Spalten: ");
        int columns = sc.nextInt();

        System.out.printf("Anzahl Zeilen: ");
        int rows = sc.nextInt();
        

        sc.close();

        printRows(rows, columns);
    }

    private static void printRows(int rows, int columns) {
        printHeader(columns);
        
        for(int i = 1; i<=rows; i++){
            System.out.printf(" %3d|", i);
            printColumn(columns, i);
            System.out.printf("\n");
        }
    }

    private static void printColumn(int columns, int num) {
        for(int i = 1; i<=columns; i++){
            System.out.printf("%3d ", i*num);
        }
    }

    private static void printHeader(int num) {
        System.out.printf("  + |");

        for(int i = 1; i <= num; i++) {
            System.out.printf("%3d ", i);
        }

        System.out.printf("\n-----");

        for(int i = 1; i <= num; i++){
            System.out.printf("----");
        }
        System.out.printf("\n");
    }
    
}
