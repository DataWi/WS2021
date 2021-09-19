package ws2021.section_b;

import java.util.Scanner;

public class Swapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("enter first number (a): ");
        int a = sc.nextInt();
        System.out.printf("enter second number (b): ");
        int b = sc.nextInt();

        sc.close();

        System.out.printf("a=%d, b=%d\n",a,b);
        System.out.printf("swapped:\n");
        System.out.printf("a=%d, b=%d",b,a);
    }
}
