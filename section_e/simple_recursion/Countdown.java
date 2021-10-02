package ws2021.section_e.simple_recursion;

public class Countdown {
    public static void countdown(int n) {
        if(n < 0) {
            System.out.printf("boom!");
            return;
        }
        
        System.out.printf("%d\n", n);
        
        countdown(--n);
        }
}
