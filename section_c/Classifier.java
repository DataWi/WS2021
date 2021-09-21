package ws2021.section_c;

import java.util.Scanner;

public class Classifier {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.printf("enter price: ");
        int price = sc.nextInt();

        System.out.printf("enter quality: ");
        int quality = sc.nextInt();

        sc.close();
        
        boolean highPrice = checkPrice(price);
        boolean highQuality = checkQuality(quality);

        printCategory(highPrice,highQuality);
    }






    private static boolean checkQuality(int quality) {
        boolean highQuality = false;

        if(quality >= 50){
            System.out.printf("high quality\n");
            highQuality = true;
        } else {

            System.out.printf("low quality\n");
        }

        return highQuality;
    }

    private static boolean checkPrice(int price) {
        boolean highPrice=false;

        if(price >= 50) {
            System.out.printf("high price\n");
            highPrice = true;
        } else {
            System.out.printf("low price\n");
        }

        return highPrice;
    }

    private static void printCategory(boolean highPrice, boolean highQuality) {

        String category;
        if(highPrice) {
            if(highQuality) {
                category = "luxury";
            } else {
                category = "rip off";
            }
        } else {
            if(highQuality){
                category = "bargain";
            } else {
                category = "junk";
            }
        }


        System.out.printf("%s", category);
    }
}
