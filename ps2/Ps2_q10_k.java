
package ps2_q10_k;

import java.util.Scanner;

public class Ps2_q10_k {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integer number: ");
        double number1 = input.nextInt();
        double number2 = input.nextInt();

        if (number1 >= number2) {
            if (number2 == 0) 
                System.out.println("INFINITE");
             else 
                System.out.println("division of numbers: " + (number1 / number2));
            
        } else {
            if (number1 == 0) 
                System.out.println("INFINITE");
             else 
                System.out.println("division of numbers: " + (number2 / number1));
        }
    }
    
}
