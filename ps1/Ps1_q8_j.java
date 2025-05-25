
package ps1_q8_j;

import java.util.Scanner;

public class Ps1_q8_j {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the cost of an item: ");
        double cost = input.nextDouble();
        final double kdv = 0.12;
        
        double amountOfVat = kdv * cost;
        System.out.println( "Amount of VAT: " + amountOfVat);
        System.out.println("Cost of item with VAT: " + (cost + amountOfVat));

    }
    
}
