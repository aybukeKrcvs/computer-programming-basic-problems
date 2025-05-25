package ps3_q2_h;
import java.util.*;
public class Ps3_q2_h {

    public static void main(String[] args) {

        final int TOTAL_NUMBERS = 50;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <= TOTAL_NUMBERS; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();

            if (number > max) 
                max = number; // Update max if a larger number is found
            if (number < min)
                min = number; // Update min if a smaller number is found
        }

        scanner.close();
        System.out.println("\nMaximum number is " + max + 
                "\nMinimum number is " + min);
        

    }

}
