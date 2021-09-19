package ws2021.section_a;

import java.util.Scanner;

public class ReadAndPrintDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int date = sc.nextInt();
        int year = date % 10000; // 15092021 % 1000; 1509 mal enthalten, 2021 Rest

        date /= 10000; // /= -> Operator für division + Zuweisung an die Variable
        // System.out.printf("%d\n", date);
        int month = date % 100;
        int day = date /100;

        sc.close();

        System.out.printf("%02d.%02d.%d",month,day,year);
    }
}
