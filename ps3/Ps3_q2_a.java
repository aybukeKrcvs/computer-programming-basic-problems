
package ps3_q2_a;

import java.util.Scanner;

public class Ps3_q2_a {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++){
            System.out.println("For object " + i + ":");
            System.out.print("Enter the mass in kg: ");
            double mass = input.nextDouble();
            System.out.print("Enter the volume: ");
            double volume = input.nextDouble();
            
            double density = mass * 1000 / volume;
            
            if (density < 1.0)
                System.out.println("object " + i + " will float in water\n");
            else
                System.out.println("object " + i + " will sink in water\n");
        }
    }
    
}
