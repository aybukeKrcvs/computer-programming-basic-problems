
package ps4_q2_i;
import java.util.*;
import java.lang.*;
public class Ps4_q2_i {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of set of inputs: ");
        int numberOfPairs = input.nextInt();
        
        int bigX = 0, bigY = 0, equal = 0;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        
        for (int i = 0; i < numberOfPairs; i++){
            System.out.print("Enter values of x and y respectively: ");
            int x = input.nextInt();
            int y = input.nextInt();
            
            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            
            if (Math.abs(x) > Math.abs(2 * y))
                bigX++;
            else if (Math.abs(x) < Math.abs(2 * y))
                bigY++;
            else
                equal++;
 
        }
        System.out.println("\ncondition |x| > |2Y|: " + bigX +
                "\ncondition |x| < |2Y|: " + bigY + 
                "\ncondition |x| = |2Y|: " + equal);
        
        System.out.println("\nMinimum value of x is " + minX + 
                "\nMinimum value of y is " + minY);
    }
    
}
