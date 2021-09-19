package ws2021.section_b;

import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mass = sc.nextDouble();
        double height = sc.nextDouble();

        double bmi = mass/(height*height);


        if (bmi <= 15.00){
            System.out.printf("Very severely underweight %d",bmi);
            return;
        }
        if (bmi <= 16.00){
            System.out.printf("Severely underweight");
            return;
        }
        if (bmi <=18.50	){
            System.out.printf("Underweight");
            return;
        }
        if (bmi <= 25.00){
            System.out.printf("Normal");
            return;
        }
        if (bmi <=30.00	){
            System.out.printf("Overweight");
            return;
        }
        if (bmi<=35.00){
            System.out.printf("Moderately obese");
            return;
        }
        if (bmi<=40.00){
            System.out.printf("Severely obese");
            return;
        }



        System.out.printf("Very severely obese");

    }
}
