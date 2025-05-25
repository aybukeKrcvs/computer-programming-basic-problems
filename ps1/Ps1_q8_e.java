
package ps1_q8_e;
import java.util.Scanner;
public class Ps1_q8_e {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Centigrade: ");
        double centigrade = input.nextDouble();
        
        double fahrenheit = centigrade * 1.8 + 32;
        System.out.printf("%.2f degrees Centigrade equals "
                + "%.2f degrees Fahrenheit.\n", centigrade,fahrenheit);
    }
    
}
