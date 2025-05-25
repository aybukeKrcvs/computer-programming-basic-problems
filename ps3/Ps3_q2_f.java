package ps3_q2_f;

import java.util.Scanner;

public class Ps3_q2_f {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        double total = 0, mult = 1;

        do {
            System.out.print("Enter the value of m: ");
            m = input.nextInt();
            System.out.print("Enter the value of n: ");
            n = input.nextInt();
        } while (m <= 0 || m >= n);
        
        for (int i = m; i <= n; i++){
            total += i;
            mult *= i;
        }
        
        double result = total / mult;
        System.out.println("the result is " + result);    
    }

}
