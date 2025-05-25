package ps2_q10_m;

import java.util.*;

public class Ps2_q10_m {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the mass of an object in kg: ");
        double kilogram = input.nextDouble();
        System.out.print("Enter the volume of an object in cm^3: ");
        double volume = input.nextDouble();
        
        double densityOfSubstance = kilogram * 1000 / volume;
        
        if (densityOfSubstance < 1)
            System.out.println("the substance will float");
        else 
            System.out.println("rhe substance will sink");
    }

}
