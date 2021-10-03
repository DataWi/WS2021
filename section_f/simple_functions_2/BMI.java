package ws2021.section_f.simple_functions_2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.printf("weight [kg]: ");
        weight = sc.nextDouble();
        System.out.printf("height [m]: ");
        height = sc.nextDouble();
        sc.close();
        System.out.printf("m=%.2fkg h=%.2fm -> BMI=%.2f (", weight, height, bmi = bmiCalc(height, weight));
        bmiMessage(bmiCategory(bmi));
        System.out.printf(")\n");
    }

    public static double bmiCalc(double height, double weight) {
        double bmi;
        if(height <= 1.6 || weight <=40){
            bmi=-1;
        } else {
            bmi = weight/(height*height);
        }
        return bmi;    
    }

    public static int bmiCategory(double bmi) {
        int category;
        if (bmi <=0){
            category = -1;
            return category;
        }
        if (bmi <= 15.00){
            category = 10;
            return category;
        }
        if (bmi <= 16.00){
            category = 11;
            return category;
        }
        if (bmi <=18.50	){
            category = 12;
            return category;
        }
        if (bmi <= 25.00){
            category = 20;
            return category;
        }
        if (bmi <=30.00	){
            category = 30;
            return category;
        }
        if (bmi<=35.00){
            category = 40;
            return category;
        }
        if (bmi<=40.00){
            category = 41;
            return category;
        }
        if (bmi>=40.00){
            category = 42;
            return category;
        }
        return category=-1;
    }

    public static void bmiMessage(int bmiCategory){
        switch(bmiCategory){
            case 10:
            System.out.printf("Very severely underweight");
            break;
            case 11:
            System.out.printf("Severely underweight");
            break;
            case 12:
            System.out.printf("Underweight");
            break;
            case 20:
            System.out.printf("Normal");
            break;
            case 30:
            System.out.printf("Overweight");
            break;
            case 40:
            System.out.printf("Moderately obese");
            break;
            case 41:
            System.out.printf("Severely obese");
            break;
            case 42:
            System.out.printf("Very severely obese");
            break;
            default:
            System.out.printf("invalid");
            break;
        }
    }
}
