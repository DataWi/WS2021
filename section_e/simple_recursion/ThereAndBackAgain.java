package ws2021.section_e.simple_recursion;

public class ThereAndBackAgain {
    public static int countdown(int n){
        if (n == 0) {
            System.out.printf("%d\n", n);
            return n;
        }
        
        System.out.printf("%d\n", n);
        countdown(n-1);
        
        System.out.printf("%d\n", n);
        return n;
    }
}
