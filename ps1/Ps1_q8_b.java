
package ps1_q8_b;
import java.util.Scanner;
public class Ps1_q8_b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of Turkish Liras: ");
        double lira = input.nextDouble();
        
        double dollarToLira = 30.20, euroToLira = 32.96;
        double dollar = lira / dollarToLira;
        double euro = lira / euroToLira;
        
        System.out.printf("You can buy %.2f dollar or "
                + "%.2f euro with %.2f Turkish liras.\n", dollar, euro, lira);
    }
    
}
