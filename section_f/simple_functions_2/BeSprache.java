package ws2021.section_f.simple_functions_2;

import java.util.Scanner;

public class BeSprache {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        word = word.toLowerCase();
        System.out.printf("%s\n", word);

        word = word.replaceAll("(a|e|i|o|u)", "$0b$0");
        System.out.printf("%s", word);
    }

}
