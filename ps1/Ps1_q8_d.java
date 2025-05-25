
package ps1_q8_d;
import java.util.Scanner;
public class Ps1_q8_d {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        double centigrade = (fahrenheit - 32) / 1.8;
        System.out.printf("%.2f degrees Fahrenheit equals "
                + "%.2f degrees Centigrade.\n", fahrenheit, centigrade);
        
    }
    
}
