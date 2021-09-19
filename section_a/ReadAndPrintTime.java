package ws2021.section_a;

import java.util.Scanner;

public class ReadAndPrintTime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        sc.close();

        System.out.printf("%02d:%02d",hours, minutes);
    }
}
