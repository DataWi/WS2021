package ws2021.section_f.simple_functions_2;

import java.util.Scanner;


public class WeekdaysFunctions {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("enter date (yyyymmdd): ");
		int date = sc.nextInt();
		
		int inDay = date % 100, inMonth = date % 10000 / 100, inYear = date / 10000;
		
		if(validate(inYear, inMonth, inDay)){
			int W = weekday(inDay, inMonth, inYear);
			String weekday = dayName(W);
			
			System.out.printf("%s",  weekday);
			
		}else {
			System.out.printf("invalid date (%d)\n", date);
		}
        sc.close();
	}

    public static boolean validate(int year){
        boolean valid=true;
        if(year > 2199 || year < 1582) {
            valid=false;
        }
        return valid;
    }

    public static boolean validate(int year, int month) {
        boolean valid = true;
        valid = validate(year);

        if(valid == false){
            return valid;
        }

        if(12 < month || month < 1){
            valid=false;
            return valid;
        }

        if(year == 1582 && month < 10) {
            valid=false;
            return valid;    
        }
        return valid;
    }

    public static boolean isLeap(int inYear) {
        boolean result=false;
       
        if(inYear%4 == 0) {
            result = true;
            if(inYear%100 == 0){
                result = false;
            }
            if(inYear%400 == 0){
                result=true;
            }
        }

        return result;
    }

    public static int nDays(int month, int year){
        int days=0;
        switch(month){
            case 2:
            days = isLeap(year) ? 29 : 28;
            break;
            case 4:
            days = 30;
            break;
            case  6:
            days = 30;
            break;
            case  9:
            days = 30;
            break;
            case 11:
            days = 30;
            break;
            default:
            days = 31;
            break;
        }

        return days;
    }

    public static boolean validate(int year, int month, int day){
        boolean valid = true;
        if(validate(year) == false || validate(year, month) == false) {
            valid=false;
            return valid;
        }

        if((year == 1582 && month == 10) && day < 16){
            valid = false;
        }
        if((day > nDays(month, year) )|| (day < 1)){
            valid=false;
        }

        return valid;
    }

    public static int weekday(int inDay, int inMonth, int inYear) {
        int day;
        // If month is January or February, it actually belongs to the last year. 
        // This is handled by ternary expression inMonth < 3 ? year -1 : year
        int y=inMonth < 3? (inYear - 1)%100 : inYear%100; 
        int c=inMonth <3 ? (inYear - 1)/100 : inYear/100;
        int m=inMonth < 3 ? inMonth + 10 : inMonth - 2;

        // use double for calculations with double values
        double monthCalc = 2.6*m - 0.2;
        double yearCalc = y/4;
        double centuryCalc = c/4;

        // Typecasting double to int with (int)x
        int monthC = (int)monthCalc;
        int yearC = (int)yearCalc;
        int centuryC = (int)centuryCalc;

        
        
        int A = inDay + monthC + y + yearC + centuryC - 2*c;
        // A = A<0? A+7 : A;
        day = Math.floorMod(A, 7);

        return day;
    }

    public static String dayName(int W) {
        String day = "";
        switch(W){
            case 0:
            day = "Sunday"; 
            break;
            case 1:
            day = "Monday";
            break;
            case 2:
            day = "Tuesday";
            break;
            case 3:
            day = "Wednesday";
            break;
            case 4:
            day = "Thursday";
            break;
            case 5: 
            day = "Friday";
            break;
            case 6:
            day = "Saturday";
            break;
        }

        return day;
    }
}
