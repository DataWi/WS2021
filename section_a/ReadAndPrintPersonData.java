package ws2021.section_a;

import java.util.Scanner;

public class ReadAndPrintPersonData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.next();
        String lastName = sc.next();
        int birthYear = sc.nextInt();
        int birthMonth = sc.nextInt();
        int birthDay = sc.nextInt();
        double weight  = sc.nextDouble();
        double height  = sc.nextDouble();

        sc.close();

        System.out.printf("%2.7s %2.7s %02d.%02d.%02d %.1fm %.1fkg",firstName, lastName, birthDay, birthMonth, birthYear, height, weight);
    }

}
