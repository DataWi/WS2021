package ws2021.section_c;

import java.util.Scanner;

public class Milch {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Fettgehalt: ");
        int fettGehalt = sc.nextInt();
        System.out.printf("Haltbar: ");
        int haltbarkeit = sc.nextInt();
        sc.close();

        String result;

        if (fettGehalt < 0) {
            System.out.printf("Ungueltig!");
            return;
        }

        if(haltbarkeit == 0) {
            if(fettGehalt < 3 ) {
                result="Leichtmilch (frisch)";
            } else if ( fettGehalt > 7) {
                result="Extravollmilch (frisch)";
            } else if (fettGehalt >= 3 || fettGehalt <= 7) {
                result="Normalmilch (frisch)";
            } else {
                result="Ungueltig!";
            }
        } else if (haltbarkeit == 1) {
            if (fettGehalt < 3) {
                result = "Leichtmilch (haltbar)";
            } else if (fettGehalt > 7) {
                result = "Extravollmilch (haltbar)";
            } else if (fettGehalt >= 3 || fettGehalt <= 7) {
                result = "Normalmilch (haltbar)";
            } else {
                result = "Ungueltig!";
            }
        } else {
            result="Ungueltig!";
        }

        System.out.printf("%s", result);
    }


}
