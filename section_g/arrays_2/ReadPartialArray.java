package ws2021.section_g.arrays_2;

import java.util.Scanner;

public class ReadPartialArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {};
        int i=0;
        do{
            System.out.printf("%d. number: ", i+1);
            int tmp = sc.nextInt();
            numbers[i] = validate(tmp, sc);
            i++;
        }while(numbers[i]!=10 ||i==9 );

        print(numbers);

        sc.close();

    }

    private static int validate(int num, Scanner sc){
        while(num < 0){
            System.out.printf("invalid input!\n");
            System.out.printf("%d. number: ");
            num = sc.nextInt();
        }
        return num;
    }

    private static void print(int[] numbers){
        System.out.printf("%d number(s) entered.", numbers.length);
        for(int i=0; i<numbers.length; i++){
            System.out.printf("[%d]: %d",i, numbers[i]);
        }
        
        System.out.printf("Output finished.");
    }
}
