
package ps2_q10_a;

import java.util.Scanner;

public class Ps2_q10_a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();
        int result;
        
        if (number > 0)
            result = number * number;
        else
            result = number * number * number;
        
        System.out.println("result: " + result);
    }
    
}
