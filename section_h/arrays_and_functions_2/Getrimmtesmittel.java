package ws2021.section_h.arrays_and_functions_2;

import java.util.Scanner;


public class Getrimmtesmittel {
    static Scanner sc = new Scanner(System.in);

    public static int trim(double betraege[], double min, double max) {
        int counter = 0;
        double temp;

        for(int i=0; i<betraege.length; i++) {
            temp = validate(betraege[i], min, max);
            if (temp == 0) {
                counter = counter+1;
            }
            betraege[i] = temp;
        }
        return counter;
    }

    private static double validate(double num, double min, double max) {
        if (num < min) {
            return 0;
        } else if (num > max) {
            return 0;
        }
        return num;
    }

    public static void eingabe(double betraege[]) {
        for(int i=0; i<betraege.length; i++){
            System.out.printf("Zahl %d: ", i+1);
            betraege[i] = sc.nextDouble();
        }
    }

    public static double sum(double betraege[]){
        double sum = 0;
        for(int i=0; i<betraege.length; i++){
            sum = sum + betraege[i];
        }

        return sum;
    }


    public static void main(String[] args){
        double[] betraege = new double[10];
        double min, max;
        int modified=0, length = betraege.length;

        eingabe(betraege);

        System.out.printf("Untergrenze: ");
        min = sc.nextDouble();
        System.out.printf("Obergrenze: ");
        max = sc.nextDouble();
        System.out.printf("Mittel ungetrimmt: %.2f \n", sum(betraege)/length);
        modified = trim(betraege, min, max);
        length = length - modified;
        System.out.printf("Mittel getrimmt: %.2f ", sum(betraege)/length);

        sc.close();
    }
}
