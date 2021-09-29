package ws2021.tests;

import java.util.Scanner;

public class MidTermExam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");
        int running = sc.nextInt();
        System.out.printf(": ");
        int walking = sc.nextInt();

        running=validateNumber(running, sc);
        walking=validateNumber(walking, sc);
    
        printIntervall(running, walking, sc);

        sc.close();

    }

    private static int validateNumber(int num, Scanner sc) {
        while (num <= 0){
            
            System.out.printf(": ");
            num = sc.nextInt();
        }
        
        return num;
    }

    private static void printIntervall(int running, int walking, Scanner sc){
        int minute = Integer.MAX_VALUE;
        
        

        while(minute > 0 ){
            System.out.printf(": ");
            minute=sc.nextInt();
            
            if(minute <= 0 ){
                continue;
            }

            if(minute<=(walking+running)){
                if(minute > running){
                    System.out.printf("gehen\n");
                    continue;
                }
                
                System.out.printf("laufen\n");
                continue;
            }

            int normalizedMinutes = minute%(running+walking);
            
            if(normalizedMinutes <= running){
                if(normalizedMinutes == 0) {
                System.out.printf("gehen\n");
                }
                System.out.printf("laufen\n");
            } else {
                System.out.printf("gehen\n");
            }
        }
        
        System.out.printf("ende.");
    }

    
}
