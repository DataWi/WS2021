package ws2021.section_d;

import java.util.Scanner;

public class FritzQuack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");

        int num = sc.nextInt();
        sc.close();

        for(int i=1; i<=num; i++) {
                 if (i%5 == 0 || i%7 == 0) {
                    if (i%5==0 && i%7==0){
                        System.out.printf("FitzQuack ");
                    } else if (i%7==0){
                        System.out.printf("Quack ");
                    } else if (i% 5 == 0){
                        System.out.printf("Fitz ");
                    }
                } else {
                    System.out.printf("%d ",i);
                }
                
                if(i%10 == 0) {
                    System.out.printf("\n");
                } 
            } 

    }
    
}
