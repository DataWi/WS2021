package ws2021.section_b;

import java.util.Scanner;

public class Karte {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Eingabe: ");
        int number = sc.nextInt();
        sc.close();
        String line = "---------------";
        String slash = "\\";

        System.out.printf("%s\n",line);
        System.out.printf("| %-3d     %3d |\n",number, number);
        System.out.printf("| %s         / |\n",slash);
        System.out.printf("|  %s       /  |\n",slash);
        System.out.printf("|   %s     /   |\n",slash);
        System.out.printf("|    %s   /    |\n",slash);
        System.out.printf("|     %s /     |\n",slash);
        System.out.printf("|      X      |\n",slash);
        System.out.printf("|     / %s     |\n",slash);
        System.out.printf("|    /   %s    |\n",slash);
        System.out.printf("|   /     %s   |\n",slash);
        System.out.printf("|  /       %s  |\n",slash);
        System.out.printf("| /         %s |\n",slash);
        System.out.printf("| %+-4d   %+4d |\n",number,number);
        System.out.printf("%s\n",line);

    }
}
