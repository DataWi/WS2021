package ws2021.section_d;

import java.util.Scanner;

public class MinMaxSumOf4Of5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, tmp, smallest, biggest;
        String line;
    
        System.out.printf(": ");
        line = sc.nextLine();
        sc.close();

        String[] numbers = line.split(" ");
        
        tmp = Integer.parseInt(numbers[0]);
        smallest = tmp;
        biggest = tmp;
        num = tmp;
        
        for (int i = 0; i<numbers.length; i++) { 
            if (i == 0) {
                continue;
            }
            int temp = Integer.parseInt(numbers[i]);
            smallest = temp < tmp ? temp : tmp;
            biggest = temp > tmp ? temp: tmp;
            num=num+temp;
        }


        System.out.printf("minimum sum: %d\n", num-biggest);
        System.out.printf("maximum sum: %d", num-smallest);

    }
}
