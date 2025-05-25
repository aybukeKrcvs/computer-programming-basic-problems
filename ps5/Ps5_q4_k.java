
package ps5_q4_k;

import java.util.Scanner;

public class Ps5_q4_k {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the cost of an item: ");
        double cost = input.nextDouble();
        System.out.print("Enter the percentage of VAT: ");
        double vatPercentage = input.nextDouble();
        
        double vat = calculateVAT(cost, vatPercentage);
        System.out.printf("\nAmount of VAT you have to pay is: %.2f\n", vat);
        System.out.printf("Total cost with VAT is: %.2f\n", (cost + vat));
    }
    
    public static double calculateVAT(double totalCost, double vatPercentage) {
        double vat = totalCost * vatPercentage / 100;
        return vat;
    }
}
