package ws2021.section_b;

import java.util.Scanner;

public class MiniTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ticketNumber  = sc.nextLong();
        sc.close();
        long num = ticketNumber %2;

        if (num == 1){
            System.out.printf("rechts");
            return;
        }
        System.out.printf("links");

    }

}
