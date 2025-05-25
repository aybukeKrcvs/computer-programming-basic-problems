
package ps3_q2_i;
import java.util.*;
public class Ps3_q2_i {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int TOTAL_NUMBER = 1000;
        int positiveCounter = 0;
        
        for (int i = 1;i <= TOTAL_NUMBER;i++){
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            
            if (number > 0)
                positiveCounter++;
        }
        
        input.close();
        double percentage = (double)positiveCounter / TOTAL_NUMBER * 100;
        System.out.println("\nPercentage of positive numbers is " + percentage);
    }
    
}
