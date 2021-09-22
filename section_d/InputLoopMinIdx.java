package ws2021.section_d;

import java.util.Scanner;

public class InputLoopMinIdx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, pos;

        System.out.printf(": ");
        num = sc.nextInt();

        if (num > 0) {
            pos = loopPosition(num, sc);
            System.out.printf("minIdx: %d\n", pos);
        }
        sc.close();
        System.out.printf("End.");

    }

    private static int loopPosition(int i, Scanner sc) {
            int low=i, pos=1, tmp=low;
            while (i > 0) {
                System.out.printf(": ");
                i = sc.nextInt();
                pos++;
                
                low = low > i ? i : low;
                tmp = (low > 0)  &&  low >= i ? pos : tmp;
            }
            return tmp;
    }
    
}
