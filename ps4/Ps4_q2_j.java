package ps4_q2_j;
import java.util.*;
public class Ps4_q2_j {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();
        double y = 0;
        int denominator = 1;
        
        for (int i = 2; i <= 14; i += 2) {  //i represents power of x
            for (int j = i+1; j > 0; j--)   //j represents factorial denomitor
                denominator *= j;
            y += Math.pow(x, i) / denominator;  
        }
        System.out.printf("Sum of the values is %.2f\n", y);
    }
    
}
