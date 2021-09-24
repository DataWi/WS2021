package ws2021.section_f;

import java.util.Scanner;

public class Walker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horizontalPos = 0, verticalPos = 0, input=0, counter=0;
        printField(horizontalPos, verticalPos);

        while(input != 5){
            System.out.printf("Eingabe: ");
            input=sc.nextInt();
            switch(input) {
                case 8:
                    if(verticalPos < 9) {
                        verticalPos++;
                        counter++;
                        printField(horizontalPos, verticalPos);
                    } else {
                        System.out.printf("Aktion unmoeglich!\n");
                        printField(horizontalPos, verticalPos);
                    }
                    break;
                case 2:
                    if(verticalPos > 0){
                        verticalPos--;
                        counter++;
                        printField(horizontalPos, verticalPos);
                    }  else {
                        System.out.printf("Aktion unmoeglich!\n");
                        printField(horizontalPos, verticalPos);
                    }
                    break;
                case 4:
                    if(horizontalPos > 0){
                        horizontalPos--;
                        counter++;
                        printField(horizontalPos, verticalPos);
                    } else {
                        System.out.printf("Aktion unmoeglich!\n");
                        printField(horizontalPos, verticalPos);
                    }
                    break;
                case 6:
                    if(horizontalPos < 9) {
                        horizontalPos++;
                        counter++;
                        printField(horizontalPos, verticalPos);
                    } else {
                        System.out.printf("Aktion unmoeglich!\n");
                        printField(horizontalPos, verticalPos);
                    }
                    break;
                case 5:
                    System.out.printf("Schritte insgesamt: %d", counter);
                    break;
                default:
                    System.out.printf("Unbekannte Aktion!\n");
                    printField(horizontalPos, verticalPos);
                    break;
            }
        }
        sc.close();

    }

    private static void printField(int horizontalPos, int verticalPos) {
        for(int i=9; i >= 0; i--) {
            if(i==verticalPos){
                for(int j=0; j < 10; j++){
                    if(j==horizontalPos){
                        System.out.printf("x");
                    } else {
                        System.out.printf(".");
                    }
                }
            } else {
                for(int j=0; j< 10; j++){
                    System.out.printf(".");
                }
            }
            System.out.printf("\n");

            }
            System.out.printf("\n");
    }





}
