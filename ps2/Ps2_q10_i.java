package ps2_q10_i;

import java.util.*;

public class Ps2_q10_i {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the value of x and y: ");
        double x = input.nextInt();
        double y = input.nextInt();
        double absDifference;
        
        if (x >= y)
            absDifference = x - y;
        else 
            absDifference = y - x;
        
        System.out.println("absolute difference of x and y is " + absDifference);
        
    }

}
