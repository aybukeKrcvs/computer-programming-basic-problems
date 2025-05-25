
package ps3_q2_e;
import java.util.*;
public class Ps3_q2_e {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = input.nextInt();
        
        double  total = 0;

        for (int n = 0; n <= 100; n++) {
            double calculate = 1;
            for (int i = 0; i < n; i++)
                calculate *= x;
            total += calculate;
            System.out.println(total);
        }
        System.out.println(total);
    }
    
}
