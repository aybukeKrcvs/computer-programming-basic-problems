
package ps5_q5_m;

import java.util.Scanner;

public class Ps5_q5_m {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();
        
        System.out.println("Sum of the terms is " + calculation(x));
    }
    
    public static double calculation(double x) {
        double term = x, sum = 0;
        int index = 1, exp = 1;
        
        while (term >= 0.00005) {            
            if (index % 2 != 0)
                term = Math.pow(x, exp) / factorial(exp);
            else
                term = -Math.pow(x, exp) / factorial(exp);
            sum += term;
            index++;
            exp += 2;
        }
        return sum;
    }
    
    public static int factorial(int number) {
        int fact = 1;
        if (number == 0)
            return fact;
        else
            for (int i = 2;i <= number;i++) 
                fact *= i;
            return fact;
    }
}
