package ws2021.section_b;
import java.util.Scanner;
public class GradeValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        sc.close();
        if (grade > 0 && grade < 6)
        {
            System.out.printf("is valid!");
            // Return is a guard statement. It ends the method here.
            return;
        }
        System.out.printf("is invalid!");
    }
}
