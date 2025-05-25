package ps2_q10_o;

import java.util.*;

public class Ps2_q10_o {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double weeklyPay = 250;
        final double extraPayPerHour = 7.5;
        final double minWorkingHours = 40; 
        
        System.out.print("What is worker's ID? ");
        long id = input.nextLong();
        System.out.print("How many hours did the worker work this week? ");
        double totalHoursPerWeek = input.nextDouble();
        
        double totalExtraPay = 0;
        
        if (totalHoursPerWeek > minWorkingHours)
             totalExtraPay = (totalHoursPerWeek - minWorkingHours) * extraPayPerHour;
        
        System.out.println("Worker's ID:" + id + 
                " get paid " + (weeklyPay + totalExtraPay) + " YTL");
    }

}
