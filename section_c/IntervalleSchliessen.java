package ws2021.section_c;

import java.util.Scanner;

public class IntervalleSchliessen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Grenze 1: ");
        int borderOne = sc.nextInt();
        System.out.printf("Grenze 2: ");
        int borderTwo = sc.nextInt();
        System.out.printf("Grenze 1: ");
        int borderThree = sc.nextInt();
        System.out.printf("Grenze 2: ");
        int borderFour = sc.nextInt();
        sc.close();


        closeInterval(borderOne, borderTwo, borderThree, borderFour);
    }



    private static void closeInterval(int borderOne, int borderTwo, int borderThree, int borderFour) {
        int firstLowBorder = Math.min(borderOne,borderTwo);
        int firstHighBorder = Math.max(borderOne, borderTwo );
        System.out.printf("Intervall 1: [%d, %d]\n", firstLowBorder, firstHighBorder);

        int secondLowBorder = Math.min(borderThree, borderFour);
        int secondHighBorder = Math.max(borderThree, borderFour);
        System.out.printf("Intervall 2: [%d, %d]\n", secondLowBorder, secondHighBorder);

        System.out.printf("geschlossenes Intervall: [%d, %d]", Math.min(firstLowBorder, secondLowBorder), Math.max(firstHighBorder, secondHighBorder));

    }

}
