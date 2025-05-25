
package ps5_q5_g;

import java.util.Scanner;

public class Ps5_q5_g {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        do {            
            System.out.print("Enter a three-digit integer: ");
            number = input.nextInt();
        } while (number < 100 || number > 999);
        
        if (number > 500)
            System.out.println("sum of its digits is " + sumOfDigits(number));
        else
            System.out.println("product of its digits is " + productOfDigits(number));
        
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
}
