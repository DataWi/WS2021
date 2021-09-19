package ws2021.section_b;

import java.util.Scanner;

public class ReactToGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();


        if (grade < 1 || grade > 5)
        {
            System.out.printf("input is invalid!");
            // Return is a guard statement. It ends the method here.
            return;
        }

        if (grade == 5){
            System.out.printf("you didn't pass!");
            // Return is a guard statement. It ends the method here.
            return;
        }
        // If no guard returns triggered, this will be printed
        System.out.printf("you passed with a %d!", grade);
    }
}
