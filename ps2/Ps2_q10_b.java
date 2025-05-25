
package ps2_q10_b;

import java.util.Scanner;

public class Ps2_q10_b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = input.nextInt();
        int y;
        
        if (x < 0)
            y = -x;
        else if (x == 0)
            y = 0;
        else
            y = x * x;
        
        System.out.println("y is " + y);
    }
    
}
