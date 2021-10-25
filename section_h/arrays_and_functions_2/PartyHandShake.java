package ws2021.section_h.arrays_and_functions_2;

import java.util.Scanner;

public class PartyHandShake {
    static Scanner sc = new Scanner(System.in);
    public static String[] readNames(int n){
        String[] names = new String[n];

        for(int i = 0; i<names.length; i++){
            names[i]= sc.next();
        }
        return names;
    }

    public static void handShakes(String[] names){
        String primaryName = names[0];
        String[] newNamesList = new String[names.length-1];
        String[] handShakes  = new String[names.length-1];

        for(int i = 1; i<names.length; i++) {
            newNamesList[i-1]=names[i];
            handShakes[i-1]=primaryName + " -> " + names[i];
        }
        print(handShakes);
        if(newNamesList.length > 1){
            handShakes(newNamesList);
        }
    }

    public static void print(String[] stra){
        for(String i:stra){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.printf(": ");
        int persons = sc.nextInt();
        String[] names = readNames(persons);
        sc.close();
        handShakes(names);
        
    }
}
