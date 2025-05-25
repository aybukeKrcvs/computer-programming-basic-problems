
package ps3_q2_t;

import java.util.Scanner;

public class Ps3_q2_t {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of term for Fibonacci sequence: ");
        int n = input.nextInt();
        input.close();
        int term1 = 0, term2 = 1;
        
        System.out.print(term1 + ", " + term2);
        for (int i = 2;i < n;i++){
            int total = term1 + term2;
            term1 = term2;
            term2 = total;
            System.out.print(", " + total);
        }
        System.out.println();
    }
    
}
