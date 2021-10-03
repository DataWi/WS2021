package ws2021.section_f.simple_functions_2;

import java.util.Scanner;

public class MilchFun {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double fett;
		int haltbar;
		int k;

		System.out.printf("Fettgehalt: ");
		fett = sc.nextDouble();
		System.out.printf("Haltbar: ");
		haltbar = sc.nextInt();

		k = klasse(fett, haltbar);
		ausgabe(k);
		sc.close();

	}
    static int klasse(double fett, int haltbar){
        int klasse;
        if (fett < 0) {
            klasse=-1;
            return klasse;
        }

        if(haltbar == 0) {
            if(fett < 3 ) {
                klasse=3;
            } else if ( fett > 7) {
                klasse=1;
            } else if (fett >= 3 || fett <= 7) {
                klasse=5;
            } else {
                klasse=-1;
            }
        } else if (haltbar == 1) {
            if (fett < 3) {
                klasse=4;
            } else if (fett > 7) {
                klasse=2;
            } else if (fett >= 3 || fett <= 7) {
                klasse=6;
            } else {
                klasse=-1;
            }
        } else {
            klasse=-1;
        }
        return klasse;
    }

    static void ausgabe(int k){
        switch(k) {
            case 1:
            System.out.printf("Extravollmilch (frisch)");
            break;
            case 2:
            System.out.printf("Extravollmilch (haltbar)");
            break;
            case 3:
            System.out.printf("Leichtmilch (frisch)");
            break;
            case 4:
            System.out.printf("Leichtmilch (haltbar)");
            break;
            case 5:
            System.out.printf("Normalmilch (frisch)");
            break;
            case 6:
            System.out.printf("Normalmilch (haltbar)");
            break;
            case -1:
            System.out.printf("Ungueltige Klassifizierung!");
            break;
            default:
            System.out.printf("Ungueltiges Argument!");
        }
    }

}
