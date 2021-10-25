package ws2021.section_h.arrays_and_functions_2;

import java.util.Scanner;

public class HundredDoors {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");
        int n = sc.nextInt();
        sc.close();

        boolean[] doors= new boolean[n];
        for(int i=0; i<doors.length; i++) {
            doors[i]=false;
        }
        changeState(doors, 1);
        
        for(int i = 0; i< doors.length; i++ ){
            if(doors[i] == true){
                System.out.printf("%d ", i+1);
            }
        }
    }

    private static void changeState(boolean[] doors, int n){
        if(n==doors.length+1) {
            return;
        }
        for(int i = 1; i<=doors.length; i++){
            if(i%n==0){
                doors[i-1] = !doors[i-1];
            }
        }
        n++;
        changeState(doors, n);
    }
}
