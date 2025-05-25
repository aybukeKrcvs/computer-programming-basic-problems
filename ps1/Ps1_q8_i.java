
package ps1_q8_i;
import java.util.Scanner;
public class Ps1_q8_i {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the quantity in TL: ");
        double quantity = input.nextDouble();
        
        final double vatRate = 0.08;
        double totalQuantity = quantity * (1 + vatRate);
        System.out.println("Final quantity with vat: " + totalQuantity);
    }
    
}
