package ws2021.section_f.simple_functions_2;

import java.util.Scanner;

public class ColorFunctions {

    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Test[] tests = { new Test() {
            @Override
            protected void exec() {
                welcome();

            }

        }, new Test() {
            @Override
            protected void exec() {
                good_bye();

            }

        }, new Test() {
            @Override
            protected void exec() {
                System.out.printf("%d\n", read_channel(sc));
            }

        }, new Test() {
            @Override
            protected void exec() {
                int a, b, c;
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                System.out.printf("%d\n", encode(a, b, c));

            }

        }, new Test() {
            @Override
            protected void exec() {
                System.out.printf("%d\n", read_rgb());
            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                // scanf("%d", &a);
                a = sc.nextInt();
                System.out.printf("%d\n", red(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", green(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", blue(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                print_rgb(a);

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", rgb_2_cmy(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", cyan(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", magenta(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", yellow(a));
            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                print_cmy(a);

            }

        }, new Test() {
            @Override
            protected void exec() {
                convert();

            }

        }

        };
        System.out.printf("Test#: ");
        int n = sc.nextInt();
        if (n < 1 || n > tests.length + 1) {
            System.out.println("unknown test.");
            return;
        }
        tests[n - 1].run();
        sc.close();
    }

    private abstract static class Test {
        protected abstract void exec();

        void run() {
            System.out.printf("executing %s\n", this.getClass().getSimpleName());
            exec();
        }
    }

    public static void welcome(){
        System.out.printf("Welcome to ColorFunctions!\n");
    }

    public static void good_bye(){
        System.out.printf("Exiting ColorFunctions!");
    }

    public static int read_channel(Scanner sc){

        int number;

        do{
            System.out.printf(": ");
            number=sc.nextInt();
        }
        while (number < 0 || number > 255 );

        return number;
    }

    public static int encode(int c1, int c2, int c3){
        int normalizedC1, normalizedC2;
        normalizedC1 = c1*1000000;
        normalizedC2 = c2*1000;

        int encoded = normalizedC1+normalizedC2+c3;
        return encoded;
    }

    public static int read_rgb(){
        System.out.printf("red");
        int red = read_channel(sc);
        System.out.printf("green");
        int green = read_channel(sc);
        System.out.printf("blue");
        int blue = read_channel(sc);

        int rgb = encode(red, green, blue);
        return rgb;
    }

    public static void print_rgb(int rgb){

        System.out.printf("R%03d G%03d B%03d\n", red(rgb), green(rgb), blue(rgb));
    }

    public static int red(int rgb){
        int red = rgb/1000000;
        return red;
    }

    public static int blue(int rgb) {
        int blue = rgb%1000;
        return blue;
    }

    public static int green(int rgb){
        int green= (rgb/1000)%1000;
        return green;
    }

    public static int rgb_2_cmy(int rgb){
        int red=red(rgb), blue=blue(rgb), green=green(rgb);
        int cyan=255-red;
        int magenta=255-green;
        int yellow=255-blue;

        int encoded = encode(cyan,magenta,yellow);
        return encoded;
    }
    public static int cyan(int cmy){
        int cyan = cmy/1000000;
        return cyan;
    }

    public static int yellow(int cmy) {
        int yellow = cmy%1000;
        return yellow;
    }

    public static int magenta(int cmy){
        int magenta= (cmy/1000)%1000;
        return magenta;
    }

    public static void print_cmy(int cmy){
        System.out.printf("C%03d M%03d Y%03d\n", cyan(cmy), magenta(cmy), yellow(cmy));
    }

    public static void convert(){
        welcome();
        int rgb = read_rgb();
        print_rgb(rgb);
        int cmy = rgb_2_cmy(rgb);
        print_cmy(cmy);
        good_bye();
    }


}
