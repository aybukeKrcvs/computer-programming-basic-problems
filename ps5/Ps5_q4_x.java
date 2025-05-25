

package ps5_q4_x;

import java.util.Scanner;

public class Ps5_q4_x {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number to return Nth term of Fibonacci: ");
        int term = input.nextInt();
        System.out.println(returnNthTermOfFibonacci(term));
    }
    
    public static int returnNthTermOfFibonacci(int term) {
        int firstTerm = 1, secondTerm = 1, nextTerm = 2;
        if (term == 1 || term == 2)
            return 1;
        else {
            for (int i = 3;i <= term;i++){
                nextTerm = secondTerm + firstTerm;
                firstTerm = secondTerm; 
                secondTerm = nextTerm;
            }
            return nextTerm;
        }
    }
}
