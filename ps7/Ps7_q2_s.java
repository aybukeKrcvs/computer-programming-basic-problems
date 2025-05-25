
package ps7_q2_s;

import java.util.Scanner;

public class Ps7_q2_s {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {5, -3, 10, 12, -8, 15, -6, 20, 7, 6, 3};
        
        System.out.print("Enter a sentinel value: ");
        int sentinal = input.nextInt();
        
        int i = 0;
        while (i < numbers.length) {
            if (sentinal != numbers[i] || i == numbers.length-1){
                System.out.print(numbers[i++] + " ");
                if (i == numbers.length-1){
                    System.out.println("\nThere is no such a value in the list");
                    System.exit(0);
                }
            }
            else if (sentinal == numbers[i]){
                System.out.println(numbers[i] + "");
                System.exit(0);
            }
        }
    }
}