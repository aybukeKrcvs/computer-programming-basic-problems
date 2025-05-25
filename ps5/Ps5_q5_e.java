
package ps5_q5_e;

import java.util.Scanner;

public class Ps5_q5_e {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        do {
           System.out.print("Enter x and y: ");
            int x = input.nextInt();
            int y = input.nextInt();

            if (x == y) 
                break;

            int absDiff = Math.abs(x - y);
            System.out.println( x + "  -  " + y + "  =  " + absDiff);
            System.out.println("");
        } while (true);
            
    }
    
}
