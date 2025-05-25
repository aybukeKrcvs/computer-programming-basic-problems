
package ps1_q8_p;

import java.util.Scanner;

public class Ps1_q8_p {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of sale: ");
        int saleNumber = input.nextInt();
        System.out.print("Enter the total value of sales: ");
        double totalValue = input.nextDouble();
        final int monthly = 400, eachPiece = 50;
        
        double salary = monthly + eachPiece * saleNumber + totalValue * 0.01;
        System.out.println("Salary: " + salary);
        
    }
    
}
