package ws2021.section_g.arrays_and_functions;

public class ArrayFunctions {
    public static void linearFill(double[] array, double start, double inc){
    
        for(int i = 0; i<array.length; i++){
            if(i==0){
                array[i]=start;
                continue;
            }
            array[i] = array[i-1]+inc;
        }
    }

    public static boolean contains(int[][] array, int key){
        boolean contains = false;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(array[i][j] == key){
                    contains=true;
                    break;
                }
            }
        }

        return contains;

    }

    public static int countBelow(double[] arr, double a) {
        int number=0;
        for(int i = 0; i<arr.length; i++){
            number = arr[i] < a ? number+1 : number;
        }
        return number;
    }

    public static int find(int[] arr, int key){
        int index = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }

        return index;
    }

    public static int find(int[] arr, int key,int startIdx) {
        int index = -1;
        startIdx = startIdx < 0 ? 0 : startIdx;

        for(int i=startIdx; i<arr.length; i++){
            if(arr[i] == key){
                index = i;
                break;
            }
            // index = arr[i] == key ? i : index;
        }

        return index;
    }

    public static String[] filter(String[] arr, String regex){
        int j=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i].matches(regex)){
                j++;
            }
        }

        String[] newArr=new String[j];
        j=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i].matches(regex)){
                newArr[j] = arr[i];
                j++;
            }

        }
        

        return newArr;
    }
}
