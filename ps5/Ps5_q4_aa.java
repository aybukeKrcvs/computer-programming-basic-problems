
package ps5_q4_aa;

import java.util.Scanner;

public class Ps5_q4_aa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to check whether it is prime or not: ");
        int number = input.nextInt();
        
        if (isPrime(number))
            System.out.println("number " + number + " is prime number");
        else
            System.out.println("number " + number + " is not prime number");
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
