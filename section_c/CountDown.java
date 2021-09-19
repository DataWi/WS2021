package ws2021.section_c;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");
        int num = sc.nextInt();

        sc.close();
        for (int i = num; i > 0; i--){
            System.out.printf("%d\n", i);
        }
        System.out.printf("Boom!");
    }
}
