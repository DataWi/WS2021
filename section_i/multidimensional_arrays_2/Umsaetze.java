package ws2021.section_i.multidimensional_arrays_2;

import java.util.Scanner;

public class Umsaetze {
    static Scanner sc = new Scanner(System.in);

    public static void printRevenues(int[][] revenues){
        System.out.printf("revenues: \n");
        for(int i=0; i<revenues.length; i++){
            for(int j=0; j<revenues[i].length; j++){
                System.out.printf("%2d ", revenues[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static int[][] scanRevenues(int branches, int days){
        int revenues[][] = new int[branches][days];
    
        
        for(int i=0; i<revenues.length; i++){
            for(int j=0; j<revenues[i].length; j++){
                System.out.printf(": ");
                revenues[i][j]=sc.nextInt();
            }
        }


        return revenues;
    }

    public static int sumDay(int[][]revenues, int day){
        int sum=0;
        for(int i=0; i<revenues.length; i++){
            for(int j=0; j<revenues[i].length; j++){
                if(j==day){
                    sum = sum + revenues[i][j];
                }
            }
        }

        return sum;
    }

    public static int sumBranch(int[][]revenues, int branch){
        int sum=0;
        for(int i=0; i<revenues[branch].length; i++){
            sum=sum+revenues[branch][i];
        }
        return sum;
    }

    public static int[] daySummary(int[][] revenues){
        int[] summary = new int[revenues[0].length];
        for(int i=0; i<summary.length; i++){
            summary[i] = sumDay(revenues, i);
        }

        return summary;
    }

    public static int[] branchSummary(int[][] revenues){
        int[] summary = new int[revenues.length];

        for(int i=0; i<summary.length; i++){
            summary[i] = sumBranch(revenues, i);
        }

        return summary;
    }

    public static int maxIdx(int[] arr){
        int index = 0;

        for(int i=1; i<arr.length; i++){
            index = arr[i] > arr[i-1] ? i : index;
        }

        return index;
    }

    public static int[] maxRev(int[][] revenues){
        int rev[] = new int[2];
        int tmp = 0;
        for(int i=0; i<revenues.length; i++){
            for(int j=0; j<revenues[i].length; j++){
                if(revenues[i][j] > tmp){
                    tmp = revenues[i][j];
                    rev[0] = i;
                    rev[1] = j; 
                }
            }
        }
        
        return rev;
    }

    public static void app(){
        int branches = 0, days =0;

        System.out.printf("branches: ");
        branches = sc.nextInt();
        System.out.printf("days: ");
        days = sc.nextInt();

        int[][] revenues = scanRevenues(branches, days);
        printRevenues(revenues);
        int[] daySummary = daySummary(revenues);
        System.out.printf("day Summary: ");
        for(int i=0; i<daySummary.length; i++){
            System.out.printf("%d ", daySummary[i]);
        }
        int maxDay=maxIdx(daySummary);
        System.out.printf("\nmax day is day %d with total revenue of %d.\n", maxDay, sumDay(revenues, maxDay));
        int[] branchSummary = branchSummary(revenues);
        System.out.printf("branch Summary: ");
        for(int i=0; i<branchSummary.length; i++){
            System.out.printf("%d ", branchSummary[i]);
        }
        int maxBranch=maxIdx(branchSummary);
        System.out.printf("\nmax branch is branch %d with total revenue of %d.\n", maxBranch, sumBranch(revenues, maxBranch));

        int highestRev = 0;
        for(int i=0; i<revenues.length; i++){
            for(int j=0; j<revenues[i].length; j++){
                highestRev = highestRev < revenues[i][j] ? revenues[i][j] : highestRev;
            }
        }

        sc.close();

        int[] maxRev = maxRev(revenues);
        System.out.printf("max revenue of %d in branch %d on day %d.",highestRev,maxRev[0],maxRev[1]);

    }
}
