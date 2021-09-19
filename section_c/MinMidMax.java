package ws2021.section_c;

import java.util.Scanner;

public class MinMidMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Geben Sie drei Zahlen ein:\n");

        System.out.printf("a: ");
        int a = sc.nextInt();
        System.out.printf("b: ");
        int b = sc.nextInt();
        System.out.printf("c: ");
        int c = sc.nextInt();
        sc.close();

        if(a == b && b == c) {
            System.out.printf("%d = %d = %d\n", a, b, c);
            System.out.printf("a = b = c");
            return;
        }

        if(a==b){
            if(b<c){
                System.out.printf("%d = %d < %d\n", a, b, c);
                System.out.printf("a = b < c");
                return;
            } else if (b>c){
                System.out.printf("%d < %d = %d\n", c, a, b);
                System.out.printf("c < a = b ");
                return;
            }
        }

        if(b==c){
            if (a<b) {
                System.out.printf("%d < %d = %d\n", a, b, c);
                System.out.printf("a < b = c");
                return;
            } else if(a>b){
                System.out.printf("%d = %d < %d\n", b, c, a);
                System.out.printf("b = c < a");
                return;
            }
        }

        if(a==c) {
            if(a<b){
                System.out.printf("%d = %d < %d\n", a, c, b);
                System.out.printf("a = c < b");
                return;
            } else if(a>b) {
                System.out.printf("%d < %d = %d\n", b, a, c);
                System.out.printf("b < a = c");
                return;
            }
        }

        if(a<b) {
            // a & b < c => a < b < c
            if(b<c){
                System.out.printf("%d < %d < %d\n", a, b, c);
                System.out.printf("a < b < c");
                return;
            // a < b && b > c => Keine klare Aussage über A!
            } else if (b>c) {
                if(a > c) {
                    System.out.printf("%d < %d < %d\n", c, a, b);
                    System.out.printf("c < a < b");
                    return;
                }
                System.out.printf("%d < %d < %d\n", a, c, b);
                System.out.printf("a < c < b");
                return;
            }
        } else if (a>b) {
            // a > b && b < c =>  Keine klare Aussage über C!
            if(b<c) {
                // a > b && b < c && a > c => b < a < c
                if (c < a) {
                    System.out.printf("%d < %d < %d\n", b, c, a);
                    System.out.printf("b < c < a");
                    return;
                 // a > b && b < c && a < c => b < a < c
                } else if (c > a) {
                    System.out.printf("%d < %d < %d\n", b, a, c);
                    System.out.printf("b < a < c");
                    return;
                }

            } else if (b>c) {
                System.out.printf("%d < %d < %d\n", c, b, a);
                System.out.printf("c < b < a");
                return;
            }
        }
    }
}
