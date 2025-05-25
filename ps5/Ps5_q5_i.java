
package ps5_q5_i;

import java.util.Scanner;

public class Ps5_q5_i {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of workers: ");
        int numberOfWorkers = input.nextInt();
        
        for (int i = 1;i <= numberOfWorkers;i++) {
            System.out.printf("For %d. worker:\n", i);
            System.out.print("Enter ID:");
            long id = input.nextLong();
            System.out.print("Enter total working hours: ");
            int hours = input.nextInt();
            
            int salary = calculatePayForWeek(hours);
            showWorkersData(id, hours, salary);
            System.out.println("");
        }
        
        
        
    }
    
    public static int calculatePayForWeek(int hours) {
        final int MIN_HOURS = 40, DEFAULT_PAY = 750, EXTRA_PER_HOUR = 75;
        
        int totalPay = 0;
        if (hours <= 40)
            totalPay += DEFAULT_PAY;
        else 
            totalPay += DEFAULT_PAY + (hours - MIN_HOURS) * EXTRA_PER_HOUR;
        return totalPay;
    }
    
    public static void showWorkersData(long id, int hours, int salary) {
        System.out.printf("ID: %-10d\thours: %d\tsalary: %d\n", id, hours, salary);
    }
}
