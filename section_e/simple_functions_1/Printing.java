package ws2021.section_e.simple_functions_1;

public class Printing {
    public static void print(){
        System.out.printf("Please enter a name:");
    }

    public static void print(String name){
        System.out.printf("Welcome %s! Please enter two numbers:", name);
    }

    public static void print(int n1, int n2){
        System.out.printf("%d * %d = %d", n1, n2, n1*n2);
    }
    
}
