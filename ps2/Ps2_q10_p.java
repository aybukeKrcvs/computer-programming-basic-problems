package ps2_q10_p;

import java.util.*;

public class Ps2_q10_p {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many years has the worker been working? ");
        int years = input.nextInt();
        System.out.print("Enter the amount of previous salary: ");
        int previousSalary = input.nextInt();
        
        double increase = 0, forFoundation = 0;
        
        if (previousSalary < 750){
            increase = previousSalary * 0.05;
            forFoundation = increase * 0.05;
        }else{
            increase = previousSalary * 0.03;
            forFoundation = increase * 0.03;
        }
            
        double newSalary = previousSalary + increase - forFoundation;
        
        System.out.println("Worker's new salary: " + newSalary);
        
    }

}
