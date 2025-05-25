
package ps5_q5_h;

import java.util.Scanner;

public class Ps5_q5_h {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.print("Enter an integer: ");
        number = input.nextInt();
        
        int numberOfDigits = countDigits(number);
        if (numberOfDigits >= 4)
            System.out.println("product of its digits is " + productOfDigits(number));
        else
            System.out.println("sum of its digits is " + sumOfDigits(number));
    }
    
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
    public static int productOfDigits(int number) {
        int product= 1;
        while (number > 0) {
            int digit = number % 10;
            product *= digit;
            number /= 10;
        }
        return product;
    }
    public static int countDigits(int number) {
        String numberStr = Integer.toString(number);
        int length = numberStr.length();
        return length;
    }
}
