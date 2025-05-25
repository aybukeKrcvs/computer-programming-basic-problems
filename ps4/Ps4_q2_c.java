
package ps4_q2_c;
import java.util.*;
public class Ps4_q2_c {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many numbers do you want to enter?: ");
        int totalItem = input.nextInt();
        int countNegative = 0;
        for (int i = 1; i <= totalItem;i++){
            System.out.printf("Enter the number %d: ", i);
            double number = input.nextDouble();
            
            if (number < 0)
                countNegative++;
        }
        
        input.close();
        double percentage = (double)countNegative / totalItem * 100;
        System.out.println("percentage of negative numbers: " + percentage);
    }
    
}
