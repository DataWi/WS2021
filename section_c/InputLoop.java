package ws2021.section_c;

import java.util.Scanner;

public class InputLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        sc.close();

        while(num >= 1 ) {
            System.out.printf(": ");
            num = sc.nextInt();
        }

        System.out.printf("End.");
    }
}
