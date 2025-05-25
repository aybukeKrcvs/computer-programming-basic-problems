package ps2_q10_v;

import java.util.*;

public class Ps2_q10_v {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three digit integer: ");
        int number = input.nextInt();

        if (number >= 100 && number <= 999) {
            int digit1 = number / 100;
            int digit2 = (number % 100) / 10;
            int digit3 = number % 10;

            if (number > 500) {
                int sum = digit1 + digit2 + digit3;
                System.out.println("Sum of digits: " + sum);
            }else {
                int product = digit1 * digit2 * digit3;
                System.out.println("Product of digits: " + product);
            }
            
        } else 
                System.out.println("Invalid value");

    }

}
