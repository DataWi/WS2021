package ws2021.section_d;

import java.util.Scanner;

public class MinMaxSumOf4Of5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum, tmp, smallest, biggest;

        System.out.printf(": ");

        tmp = sc.nextInt();
        smallest = tmp;
        biggest = tmp;
        sum = tmp;
        
        for (int i = 1; i<5; i++) { 
            int temp = sc.nextInt();
            smallest = temp < tmp ? temp : tmp;
            biggest = temp > tmp ? temp: tmp;
            sum=sum+temp;
        }
        
        sc.close();

        System.out.printf("minimum sum: %d\n", sum-biggest);
        System.out.printf("maximum sum: %d", sum-smallest);

    }
}
