
package ps1_q8_o;

import java.util.Scanner;

public class Ps1_q8_o {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the cost of the car: ");
        double cost = input.nextDouble();
        final double markupPercentage = 0.12, saleTaxPercentage = 0.06;
        
        double markup = cost * markupPercentage;
        double saleTax = markup * saleTaxPercentage;
        double wholesaleCost = cost + markup + saleTax;
        System.out.println("Wholesale cost of car: " + wholesaleCost);
    }
    
}
