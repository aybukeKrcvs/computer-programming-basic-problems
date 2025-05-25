
package ps5_q4_s;

import java.util.Scanner;

public class Ps5_q4_s {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the hours a wroker worked in a week: ");
        int hours = input.nextInt();
        System.out.print("Enter the amounts of the constant pay: ");
        int constantPay = input.nextInt();
        System.out.print("Enter the amounts of the extra pay per hours: ");
        int extra = input.nextInt();
        
        System.out.println("\nWorker's weekly salary is: " + calculatePayForWeek(hours, constantPay, extra));
    }
    
    public static double calculatePayForWeek(int hours, int constantPay, double extraPay) {
        int defaultHours = 40;
        double totalPay = 0;
        if (hours <= 40)
            totalPay += constantPay;
        else 
            totalPay += constantPay + (hours - defaultHours) * extraPay;
        return totalPay;
    }
}
