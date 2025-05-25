
package ps3_q2_l;
import java.util.*;
public class Ps3_q2_l {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of workers: ");
        int totalWorker = input.nextInt();
        
        final int WEEKLY_PAY = 200, WEEKLY_HOUR = 40; 
        final double EXTRA_PAY = 7.5;
        
        for (int i = 1; i <= totalWorker;i++){
            System.out.printf("Enter the %d. worker ID number: ", i);
            long id = input.nextLong();
            System.out.print("How many hours did the person work this week? ");
            double hours = input.nextDouble();
            
            double pay = WEEKLY_PAY + (hours - WEEKLY_HOUR) * EXTRA_PAY;
            System.out.println(id + " get paid " + pay + " YTL");
        }
    }
    
}
