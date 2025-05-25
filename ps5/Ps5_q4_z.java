
package ps5_q4_z;

import java.util.Scanner;

public class Ps5_q4_z {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        if (isDivisible(number1, number2))
            System.out.println(number1 + " is divisible by " + number2);
        else
            System.out.println(number1 + " is not divisible by " + number2);
    }
    
    public static boolean isDivisible(int number1, int number2) {
        if (number1 % number2 == 0)
            return true;
        else
            return false;
    }
}
