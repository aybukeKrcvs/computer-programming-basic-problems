
package ps2_q10_t;
import java.util.*;

public class Ps2_q10_t {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter another number: ");
        double number2 = input.nextDouble();
        double result = 0;
        
        if (number1 %2 == 0 && number2 %2 == 0)
            result = number1 * number2;
        else if (number1 %2 != 0 && number2 %2 != 0)
            result = number1 + number2;
        else if (number1 %2 != 0 && number2 %2 == 0) {
            if (number1 > number2)
                result = number1 - number2;
            else 
                result = number2 - number1;
        }else if (number1 %2 == 0 && number2 %2 != 0){
            if (number1 > number2)
                result = number2 - number1;
            else 
                result = number1 - number2;
        }
        
        System.out.println("result is " + result);
            
    }
    
}
