
package ps1_q8_c;
import java.util.Scanner;
public class Ps1_q8_c {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length in feet: ");
        double feet = input.nextDouble();
        double feetToInch = 12, inchToCm = 2.54;
        double milimeters = feet * feetToInch * inchToCm * 10;
        
        System.out.printf("%.2f feet equals %.2f milimeters.\n", feet, milimeters);
    }
    
}
