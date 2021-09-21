package ws2021.section_c;

import java.util.Scanner;

public class FitzQuackLess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++) {

                System.out.printf("%d ", i);
                if(i%10 == 0) {
                    System.out.printf("\n");
                }
        }
    }
}
