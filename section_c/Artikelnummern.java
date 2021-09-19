package ws2021.section_c;

import java.util.Scanner;

public class Artikelnummern {

    public static void main (String[] args){
        boolean check;

        Scanner sc = new Scanner(System.in);

        System.out.printf(": ");
        int articleGroup  = sc.nextInt();

        check = checkArticleGroup(articleGroup);
        if(check==false){
            return;
        }


        System.out.printf(": ");
        int secondaryGroup  = sc.nextInt();

        check = checkSecondaryGroup(articleGroup, secondaryGroup);
        if(check == false) {
            return;
        }

        System.out.printf(": ");
        int articleNumber  = sc.nextInt();
        sc.close();


        String article = evaluate(articleGroup, secondaryGroup, articleNumber);


        System.out.printf("%s", article);

    }


    private static boolean checkArticleGroup(int i) {
        boolean result = true;

        switch(i){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.printf("Falsche Eingabe");
                result=false;
        }
        return result;
    }

    private static boolean checkSecondaryGroup(int articleGroup, int i) {
        boolean result = true;
        switch(articleGroup){
            case 1:
                if(i>3){
                    System.out.printf("Falsche Eingabe");
                    result=false;
                }
                break;
            case 2:
                if(i>2 && i!= 9){
                    System.out.printf("Falsche Eingabe");
                    result=false;
                }
                break;
            case 3:
                if(i>1){
                    System.out.printf("Falsche Eingabe");
                    result=false;
                }
                break;
            default:
                System.out.printf("Falsche Eingabe");
                result=false;
        }

        return result;
    }

    private static String evaluate(int i, int j, int k) {
        String result = "";

        switch(i){
            case 1:
                switch(j) {
                    case 1:

                        switch(k) {

                            case 1:
                                result = "Bier (hell, 0,5)";
                                break;
                            case 2:
                                result = "Bier (hell, 0,33)";
                                break;
                            case 3:
                                result = "Zwickel (0,5)";
                                break;
                            case 4:
                                result = "Zwickel (0,33)";
                                break;
                            default:
                                result = "Falsche Eingabe";
                                break;

                        }
                        break;

                    case 2:
                        switch (k) {
                            case 1:
                                result = "Cola";
                                break;
                            case 2:
                                result = "Fanta";
                                break;
                            default:
                                result = "Falsche Eingabe";
                                break;
                        }
                        break;
                        
                    case 3:
                        switch (k) {
                            case 1:
                                result = "Rotwein";
                                break;
                            case 2:
                                result = "Weisser Spritzer";
                                break;
                            default:
                                result = "Falsche Eingabe";
                                break;
                        }
                        break;
                }
                break;
                
            case 2:
                switch(j) {
                    case 1:
                        switch(k) {
                            case 1:
                                result="Schnitzel";
                                break;
                            case 2:
                                result="Schweinsbraten";
                                break;
                            default:
                                result = "Falsche Eingabe";
                                break;
                        }
                        break;
                        
                    case 2:
                        if(k == 1) {
                            result = "Frankfurter";
                        }
                        break;
                    case 9:
                        if(k == 1) {
                            result = "Ketchup";
                        }
                        break;
                    default:
                        result = "Falsche Eingabe";
                        break;
                }
                break;
            case 3:
                if(k == 1) {
                result = "Zigaretten";
                } else {

                    result = "Falsche Eingabe";
                }
                break;
            default:
                result = "Falsche Eingabe";
                break;
        }


        return result;
    }
}
