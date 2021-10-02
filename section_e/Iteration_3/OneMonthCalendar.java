package ws2021.section_e.Iteration_3;

import java.util.Scanner;

public class OneMonthCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.printf("Enter number of days in month: ");
        int days = sc.nextInt();

        System.out.printf("Enter starting day of the week (1=Monday, 7=Sunday): ");
        int day = sc.nextInt(); 

        sc.close();

        printRows(days, day);
    }

    private static void printRows(int days, int day) {
        System.out.printf("\n");

        if (day==1) {
            System.out.printf("\n");
        }
        
        for(int i = 1; i<(days+day); i++) {
            if(i < day) {
                System.out.printf("   ");
                continue;
            }

            System.out.printf("%2d ", i-day+1);
            
            if(i%7==0){
                System.out.printf("\n");
            }
        }
    }

    
}
