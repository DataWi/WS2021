package ws2021.section_f.arrays_1;

public class PrintArray {
    public static void main(String[] args){
        
    int a[] = {4, 5, 7, 2, 3 ,9, 6, 4, 3, 5, 7, 8};

    for(int i = 0; i<a.length; i++){
        System.out.printf("[%d]: %d\n", i, a[i]);
    }
    System.out.printf("Output finished.");
    }
}
