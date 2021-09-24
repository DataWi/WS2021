package ws2021.section_f;

import java.util.Scanner;

public class Platzierung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int position = 1, input = 1, startNumber = 1, leader = 1;
        
            while(input > 0 ) {
                startNumber++;

                input = sc.nextInt();

                if(input <= position && input != 0) {
                    position++;
                    System.out.printf("new position: %d\n", position);

                    if (input == 1){
                        leader = startNumber;
                        System.out.printf("leader: %d\n", leader);
                    }
                }
            }

        sc.close();

        System.out.printf("final position: %d\n", position);
        System.out.printf("winner: %d", leader);


    }
    
}
