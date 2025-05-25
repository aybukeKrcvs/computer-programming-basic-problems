
package ps5_q5_r;

import java.util.Scanner;

public class Ps5_q5_r {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of k(integer): ");
        int k = input.nextInt();
        int fibonacci;
        
        if (k >= 10 && k <= 99)
            fibonacci = returnNthTermOfFibonacci(k);
        else if (k >= 100 && k <= 999)
            fibonacci = returnNthTermOfFibonacci((int)(k/10));
        else 
            fibonacci = returnNthTermOfFibonacci(15);
        
        System.out.println("fibonacci: " + fibonacci);
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
