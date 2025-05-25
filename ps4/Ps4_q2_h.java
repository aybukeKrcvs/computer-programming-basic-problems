package ps4_q2_h;
import java.util.*;
public class Ps4_q2_h {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of set of inputs: ");
        int numberOfPairs = input.nextInt();
        
        int biggerX = 0, biggerY = 0, equal = 0;
        
        for (int i = 0; i < numberOfPairs; i++){
            System.out.print("Enter values of x and y respectively: ");
            int x = input.nextInt();
            int y = input.nextInt();
            x = Math.abs(x);
            y = Math.abs(y);
            
            
            if (x > 2 * y)
                biggerX++;
            else if (x < 2 * y)
                biggerY++;
            else
                equal++;
        }
        System.out.println("\ncondition |x| > |2Y|: " + biggerX + 
                "\ncondition |x| < |2Y|: " + biggerY + 
                "\ncondition |x| = |2Y|: " + equal);
    }
    
}
