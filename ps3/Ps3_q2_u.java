
package ps3_q2_u;
import java.util.*;
import java.lang.*;
public class Ps3_q2_u {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer value: ");
        int n = input.nextInt();
        input.close();
        double y = 0; 
        
        if (n >= 10){
            for (int x = 1; x <= n; x += 2){
                y = x + 5;
                System.out.printf("for x = %2d, y = %.2f\n", x, y);
            }
        }else if (n > 0 && n < 10){
            for (int x = -n; x <= 0; x++){
                y = -Math.pow(x, 2);
                System.out.printf("for x = %2d, y = %.2f\n", x, y);
            }
        }else {
            for (int x = n; x <= -n; x -= n){
                y = Math.abs( -x + -x / 3.0);
                System.out.printf("for x = %2d, y = %.2f\n", x, y);
            }
        }
    }
    
}
