package ps2_q6;

import java.util.*;

public class Ps2_q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double x = 0, y = 0;
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        
        if (x + a > y + b){
            x = a;
            y = x + b;
        }else if (a == 0){
            b = b / 5;
        }else if (b == 0){
            a = a * 2;
        }else{
            b = b * 2;
        }
        System.out.printf("%.1f %.1f %.1f %.1f\n", b, y, a, x);
        
        

    }

}
