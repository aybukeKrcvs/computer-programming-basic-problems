package ps4_q2_k;
import java.util.*;
public class Ps4_q2_k {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();
        double y = 0, term;
        int power = 2, denominator = 1;
        
        do {   
            for (int i = power + 1;i > 0;i--)
                denominator *= i;
            term = Math.pow(x, power) / denominator;
            y += term;  
        } while (term >= 0.000001);
        
        System.out.println("Sum of the values is " + y);
    }
    
}
