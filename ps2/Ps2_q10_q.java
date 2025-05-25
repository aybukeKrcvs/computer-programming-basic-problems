
package ps2_q10_q;

import java.util.Scanner;

public class Ps2_q10_q {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many years has the worker been working? ");
        int years = input.nextInt();
        System.out.print("Enter the amount of previous salary: ");
        int previousSalary = input.nextInt();
        
        double increase = 0, forFoundation = 0, extraIncrease = 0;
        
        if (previousSalary < 750){
            increase = previousSalary * 0.05;
            forFoundation = increase * 0.05;
        }else{
            increase = previousSalary * 0.03;
            forFoundation = increase * 0.03;
        }
        
        if (years > 5)
            extraIncrease = previousSalary * 0.015;
            
        double newSalary = previousSalary + extraIncrease + increase - forFoundation;
        
        System.out.println("Worker's new salary: " + newSalary);
    }
    
}
