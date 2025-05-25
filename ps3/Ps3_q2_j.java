
package ps3_q2_j;
import java.util.*;
public class Ps3_q2_j {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int TOTAL_NUMBERS = 50;
        
        for (int i = 1;i <= TOTAL_NUMBERS; i++){
            System.out.print("Enter the value of number " + i + ": ");
            int number = input.nextInt();
            
            if (number % 3 == 0)
                System.out.println(number);
        }
    }
    
}
