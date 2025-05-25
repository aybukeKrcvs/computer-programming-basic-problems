
package ps1_q8_f;
import java.util.Scanner;
public class Ps1_q8_f {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Kelvin: ");
        double kelvin = input.nextDouble();
        
        double centigrade = kelvin - 273;
        double fahrenheit = centigrade * 1.8 + 32;
        double rankine = 512 + fahrenheit;
        System.out.printf("%.2f degrees Kelvin equals "
                + "%.2f degrees Rankine.\n", kelvin,rankine);
    }
    
}
