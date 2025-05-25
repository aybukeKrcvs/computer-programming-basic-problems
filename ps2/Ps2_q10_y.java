
package ps2_q10_y;

import java.util.Scanner;

public class Ps2_q10_y {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the usage amount: ");
        int water = input.nextInt();
        final double PER_DEFAULT = 1.5, PER_EXTRA = 2.0, BİLL;
        
        
        if (water <= 50)
            BİLL = water * PER_DEFAULT;
        else
            BİLL = water * PER_DEFAULT + (water - 50) * PER_EXTRA;
        
        System.out.println("bill: " + BİLL + " YTL");
    }
    
}
