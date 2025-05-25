package ps2_q10_g;

import java.util.*;

public class Ps2_q10_g {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the temperature in degrees Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        double centigrade = (fahrenheit - 32) / 1.8;
        
        if (centigrade >= -40 && centigrade < 0)
            System.out.println("the temperature is " + centigrade + ", very cold");
        else if (centigrade < 10)
            System.out.println("the temperature is " + centigrade + ", cold");
        else if (centigrade < 20)
            System.out.println("the temperature is " + centigrade + ", normal");
        else if (centigrade < 30)
            System.out.println("the temperature is " + centigrade + ", hot");
        else if (centigrade < 50)
            System.out.println("the temperature is " + centigrade + ", very hot");
        else 
            System.out.println("out of the range");
    }

}
