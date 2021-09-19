package ws2021.section_c;

import java.util.Scanner;

public class TimeFormatConverter {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Zeit: ");
        int time = sc.nextInt();
        sc.close();

        String format = "AM";


        // Es hilft hier, sich zu überlegen, welche bedingungen es für die Uhrzeit gibt.
        // Bsp: 0 > Zeit > 2400 ist immer ungültig, und sollte als erstes abgehandelt werden.
        // Wenn die Zahl größer als 1200 ist, sollte das Format "PM" sein, und wenn die Zahl größer als 1300 ist,
        // sollen 1200 abgezogen werden.
        // Wenn die Zahl kleiner als 100 ist, dann muss 12 davorgehängt werden

        if (0 > time || time >= 2400) {
            System.out.printf("Ungueltige Eingabe!\n");
            return;
        }
        else if(time >= 1200) {
            format = "PM";
            if(time >= 1300){
                time = time - 1200;
            }
        }
        else if(time < 100 ) {
            time = time+1200;
        }


        // Transformation der Zahlen mit % und / erst bei der Formattierten Ausgabe.

        System.out.printf("%02d:%02d %s",time/100, time%100,  format);

    }
}
