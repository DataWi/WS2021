package ws2021.section_f.arrays_1;

import java.util.Scanner;

public class PrintArrayReverse {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] numbers = readNumbers(sc);
        sc.close();

        printNumbers(numbers);
    }

    private static int[] readNumbers(Scanner sc){
        int[] numbers=new int[10];
        for (int i = 1; i<=numbers.length; i++){
            System.out.printf("%d. number: ",i);
            numbers[i-1]= sc.nextInt();
        }
        System.out.printf("Input finished.\n");

        return numbers;
    }
    
    private static void printNumbers(int[] numbers){
        for (int i=numbers.length-1; i>=0; i--){
            System.out.printf("[%d]: %d\n", i, numbers[i]);
        }
        System.out.printf("Output finished.");
    }
}
