
package ps5_q4_t;

import java.util.Scanner;

public class Ps5_q4_t {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the previous salary of a worker: ");
        double salary = input.nextDouble();
        
        System.out.println("Worker's new salary is: " + newSalary(salary));
    }
    
    public static double newSalary(double previousSalary) {
        double increase;
        
        if (previousSalary < 15000)
            increase = previousSalary * 0.10;
        else
            increase = previousSalary * 0.08;
        
        double foundation = increase * 0.05;
        double newSalary = previousSalary + increase - foundation;
        return newSalary;
    }
}
