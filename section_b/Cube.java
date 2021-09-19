package ws2021.section_b;

import java.util.Scanner;
public class Cube {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Length of a side: ");
        int length = sc.nextInt();
        sc.close();

        System.out.printf("Surface area: %d\n", 6*length*length);
        System.out.printf("Volume: %d", length*length*length);
    }
}
