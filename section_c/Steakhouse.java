package ws2021.section_c;

import java.util.Scanner;

public class Steakhouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Steak type: ");
        int typeNum = sc.nextInt();

        System.out.printf("Cooking degree: ");
        int degreeNum = sc.nextInt();

        System.out.printf("Side order: ");
        int sideNum = sc.nextInt();


        String type, degree, side, pType, topping;

        switch(typeNum) {
            case 1:
                type = "T-bone";
                degree = setCookingDegree(degreeNum);
                side = setSideOrder(sideNum);
                break;
            case 2:
                type = "Sirloin";
                degree = setCookingDegree(degreeNum);
                side = setSideOrder(sideNum);
                break;
            case 3:
                type = "Rib eye";
                degree = setCookingDegree(degreeNum);
                side = setSideOrder(sideNum);
                break;
            default:
                type = "";
                degree = "";
                side = "";
        }

        if(side == "Potatoes") {
            System.out.printf("Potatoe type: ");
            int potatoeTypeNum = sc.nextInt();

            pType = setPotatoType(potatoTypeNum);

            if (pType == "Baked potatoes"){
                System.out.printf("Potatoe topping: ");
                int potatoeToppingNum = sc.nextInt();

                topping = setTopping(potatoeToppingNum);

                System.out.printf("\n%s, %s, %s, %s", type, degree, pType, topping);
                return;
            }
            
            System.out.printf("\n%s, %s, %s", type, degree, pType);
            return;
        }

        System.out.printf("\n%s, %s, %s", type, degree, side);

        sc.close();
    }



    private static String setCookingDegree(int num) {
        String degree;

            switch(num){
                case 1:
                    degree="rare";
                    break;
                case 2:
                    degree="medium rare";
                    break;
                case 3:
                    degree="medium";
                    break;
                case 4:
                    degree="medium well done";
                    break;
                case 5:
                    degree="well done";
                    break;
                default:
                    degree="medium rare";
            }

        return degree;
    }

    private static String setSideOrder(int num) {
        String side;

        switch(num) {
            case 1:
                side = "Bread";
                break;
            case 2:
                side = "Potatoes";
                break;
            default:
                side = "Bread";
        }

        return side;
    }

    private static String setPotatoType(int num) {
        String type;

        switch(num) {
            case 1:
                type="French fries";
                break;
            case 2:
                type="Wedges";
                break;
            case 3:
                type="Baked potatoes";
                break;
            default:
                type="French fries";
        }

        return type;
    }

    private static String setTopping(int num) {
        String topping;

        switch(num) {
            case 1:
                topping="Garlic topping";
                break;
            case 2:
                topping="French dressing";
                break;
            case 3:
                topping="Buttered";
                break;
            default:
                topping="Garlic topping";
        }

        return topping;
    }

}
