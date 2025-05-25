
package ps5_q5_j;

import java.util.Scanner;

public class Ps5_q5_j {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int numberOfInt = input.nextInt();
        
        for (int i = 1;i <= numberOfInt;i++) {
            System.out.print("Enter the value of number " + i + ": ");
            int number = input.nextInt();
            if (isPrime(number))
                System.out.println("the number is prime");
            else
                System.out.println("the number is not prime");
        }
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2;i <= number / 2;i++) {
            if (number % i == 0)
                return false;
            else
                continue;
        }
        return true;
    }
}
