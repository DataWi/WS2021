package ws2021.section_e.Iteration_3;

import java.util.Scanner;

public class TickTrickTrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, counter = 1, temp, iterator=1;
        
        System.out.printf("Eingabe: ");
        num=sc.nextInt();

        while(counter < 3) {
            System.out.printf("Eingabe: ");
            temp = sc.nextInt();

            if(num == temp) {
                counter++;
                if (counter != 3){
                    System.out.printf("Track\n");
                }
            } else if ( num < temp) {
                counter = 1;
                System.out.printf("Trick\n");
            } else {
                counter = 1;
                System.out.printf("Tick\n");
            }

            num = temp;
            iterator++;
            
        }
        sc.close();
        System.out.printf("Ende (%d Eingaben)", iterator);

    }
    
}
