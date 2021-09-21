package ws2021.tests;

import java.util.Scanner;

public class LoopCounter {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");

        int num = sc.nextInt();
        sc.close();
        for(int i=1; i<=num; i++){
            System.out.printf("%d\n", i);
        }

        System.out.printf("done!");
    }
    
}
