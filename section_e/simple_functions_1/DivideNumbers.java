package ws2021.section_e.simple_functions_1;

public class DivideNumbers {
    public void divide(float number1, float number2){
        if( number2 == 0){
            System.out.printf("division by zero is not allowed!");
            return;
        }

        System.out.printf("%.2f", number1/number2);

    }
}
