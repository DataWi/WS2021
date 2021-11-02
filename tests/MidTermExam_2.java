package ws2021.tests;

import java.util.Scanner;

public class MidTermExam_2 {

        public static int add(int value, int secondValue){
            return value+secondValue;
        }
        public static int subtract(int value, int secondValue){
            return value-secondValue;
        }
        public static int multiply(int value, int secondValue){
            return value*secondValue;
        }
        public static int power(int value, int secondValue){
            int tmp=value;
            for(int i=1; i<secondValue; i++) {
                tmp=tmp*secondValue;
            }
            return tmp;
        }

        public static int factorial(int value){
            int tmp=1;
            for(int i=1; i<value; i++){
                tmp=tmp*(i+1);
            }

            return tmp;
        }

        private static int doOperation(int operation, int value, int secondValue){
            switch (operation) {
                case 1:
                value=add(value, secondValue);
                    break;
                case 2:
                value=subtract(value, secondValue);
                    break;
                case 3:
                value=multiply(value, secondValue);
                    break;
                case 4:
                value=power(value, secondValue);
                    break;
            }

            return value;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int value = 0, operation=1, secondValue;

            System.out.println(
                    "Welcome to the Calculator!\n" +
                    "Following operations are available:\n" +
                    "1 - add\n" +
                    "2 - subtract\n" +
                    "3 - multiply\n" +
                    "4 - power\n" +
                    "5 - factorial\n" +
                    "anything else stops the program\n"
            );


            while(operation <= 5 && operation >= 1){
                System.out.printf("Value: %d\n", value);
                System.out.printf("Select operation: ");
                operation=sc.nextInt();
                if(operation > 5 || operation <= 0){
                    break;
                }
                if(operation == 5){
                    value=factorial(value);
                    continue;
                }
                System.out.printf("Select 2nd value: ");
                secondValue=sc.nextInt();
                value =  doOperation(operation, value, secondValue);
            }

            sc.close();
        }

    // add functions here

}
