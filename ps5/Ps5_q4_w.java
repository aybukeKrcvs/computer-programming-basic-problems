
package ps5_q4_w;

import java.util.Scanner;

public class Ps5_q4_w {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an positive integer number: ");
        int number = input.nextInt();
        System.out.printf("Factorial of %d is: %d\n", number, factorial(number));
    }
    
    public static int factorial(int number) {
        int fact = 1;
        if (number == 0)
            return fact;
        else
            for (int i = 1;i <= number;i++) 
                fact *= i;
            return fact;
    }
}
