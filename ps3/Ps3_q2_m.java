
package ps3_q2_m;
import java.util.*;
public class Ps3_q2_m {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many workers are there in the company? ");
        int totalWorker = input.nextInt();
        
        for (int i = 0; i < totalWorker; i++){
            System.out.print("Enter the worker's ID: ");
            long id = input.nextLong();
            System.out.print("Enter the previous salary: ");
            double preSalary = input.nextDouble();
            double postSalary = 0;
            
            //subtraction part for taxes
            if (preSalary < 500){
                double increase = preSalary * 0.10 - (preSalary * 0.10 * 0.05);
                postSalary = preSalary + increase;
            }else{
                double increase = preSalary * 0.08 - (preSalary * 0.08 * 0.05);
                postSalary = preSalary + increase;
            }
            System.out.printf("New salary is %.2f YTL\n", postSalary);
        }
    }
    
}
