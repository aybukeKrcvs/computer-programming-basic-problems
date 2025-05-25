
package ps5_q5_p;

import java.util.Scanner;

public class Ps5_q5_p {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of items: ");
        int numberOfItem =input.nextInt();
        long[] id = new long[numberOfItem];
        double[] cost = new double[numberOfItem];
        double[] vat = new double[numberOfItem];
        
        for (int i = 0;i < numberOfItem;i++) {
            System.out.printf("\nFor item %d:\n", (i+1));
            System.out.print("Enter the ID: ");
            id[i] = input.nextLong();
            System.out.print("Enter the cost of item: ");
            cost[i] = input.nextDouble();
            
            vat[i] = calculateVAT(cost[i]);
        }
        
        System.out.println("\nID\t\tCost\tVAT\tCost with VAT");
        System.out.println("---------------------------------------------");
        for(int i = 0;i < numberOfItem;i++){
            System.out.printf("%d\t\t%.2f\t%.2f\t   %.2f\n", id[i], cost[i],
                    vat[i], (cost[i]+vat[i]));
        }
        
    }
    
    public static double calculateVAT(double cost) {
        double vat = cost * 0.12;
        return vat;
    }
}
