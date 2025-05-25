
package ps5_q5_l;

import java.util.Scanner;

public class Ps5_q5_l {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of worker: ");
        int numberOfWorker = input.nextInt();
        System.out.println("");
        
        for (int i = 1;i <= numberOfWorker;i++) {
            System.out.printf("For worker %d: ", i);
            System.out.print("\nEnter the name: ");
            String name = input.next();
            System.out.print("Enter the amount of previous salary: ");
            int preSalary = input.nextInt();
            
            double newSalary = newSalary(preSalary);
            System.out.printf("Name: %s\tNew Salary: %.2f\n\n", name, newSalary);
            
        }
    }
    
    public static double newSalary(double previousSalary) {
        double increase;
        
        if (previousSalary < 10500)
            increase = previousSalary * 0.10;
        else
            increase = previousSalary * 0.08;
        
        double foundation = increase * 0.05;
        double newSalary = previousSalary + increase - foundation;
        return newSalary;
    }
}
