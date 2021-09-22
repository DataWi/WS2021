package ws2021.section_d;

import java.util.Scanner;

public class NeatMultTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter rows: ");
        int rows = sc.nextInt();

        System.out.printf("enter columns: ");
        int columns = sc.nextInt();

        sc.close();
        
        printRows(rows, columns);


    }
    
    private static void printRows(int rows, int columns) {
        printRowHeader(columns);

        for (int i=1; i<=rows; i++) {
            System.out.printf(" %d | ", i);
            printColumn(columns, i);
            System.out.printf("\n");

        }
    }

    private static void printColumn(int columns, int num) {
        for (int i=1; i<=columns; i++) {
            System.out.printf("%2d ", i*num);
        }
    }
    
    private static void printRowHeader(int columns) {
        System.out.printf("\n     ");
        for (int i=1; i<= columns; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.printf("\n----");
        for (int i = 0; i<columns; i++){
            System.out.printf("---");
        }
        System.out.printf("\n");
    }

    
}
