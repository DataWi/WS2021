package ws2021.section_c;

import java.util.Scanner;

public class NumberEnding {

    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    sc.close();

    String ending;

        int secondNumber = (num /10)%10;
        int thirdNumber = num %10;

        if (secondNumber == 1) {
            ending = "th";
        } else {
            if (thirdNumber ==1) {
                ending = "st";
            }
            else if (thirdNumber ==2) {
                ending = "nd";
            }
            else if (thirdNumber==3) {
                ending="rd";
            } else {
                ending = "th";
            }
        }

        System.out.printf("%d%s", num, ending);

    }
}
