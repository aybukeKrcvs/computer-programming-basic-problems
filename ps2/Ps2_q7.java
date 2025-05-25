package ps2_q7;

import java.util.*;

public class Ps2_q7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a, k ,z;
        System.out.print("Enter the value of k: ");
        k = input.nextDouble();
        System.out.print("Enter the value of a: ");
        a = input.nextDouble();
        
        if (a > 0 && k > 0)
            a = a + k;
        else if (k == 0){
            z = a;
            a = k;
            k = z;
        }else if (a < 0)
            a = a + 1;
        else 
            k = k * 2;
        
        System.out.printf("%.1f %.1f\n", a, k);
        
    }

}
