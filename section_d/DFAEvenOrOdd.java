package ws2021.section_d;

import java.util.Scanner;

public class DFAEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int state = 0;  //initial state
        
        
        int input;
        while ( (input = sc.nextInt())==1 || input == 0) {
            switch(input) {
                case 1:
                    state=1;
                    break;
                case 0:
                    state=0;
                    break;
            }
            
            
        }
        
        System.out.printf("%s\n", (state==0)?"even":"odd");
        sc.close();
    }

}

