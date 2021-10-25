package ws2021.tests;

import java.util.Scanner;


public class Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] sequence;
		System.out.printf(": ");
		int start=sc.nextInt();
		System.out.printf(": ");
		int inkrement=sc.nextInt();
		System.out.printf(": ");
		int len=sc.nextInt();
        sc.close();

        sequence=new int[len];
            int temp=start;
            
            for(int i=start; i<sequence.length; i++ ){
                sequence[i] = temp;
                temp=temp+inkrement;
            }
            print(sequence);
		    sc.close();
        }

        public static void print(int[] a){
            for (int n : a)
                System.out.printf("%d ", n);
        }
    
}
