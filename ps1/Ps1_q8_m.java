
package ps1_q8_m;
import java.util.Scanner;
public class Ps1_q8_m {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the travel distance(m): ");
        double distance = input.nextDouble();
        System.out.print("Enter the speed of the car(km/h): ");
        double speed = input.nextDouble();
        
        double kmDistance = distance / 1000;
        double hours = kmDistance / speed;
        double seconds = hours * 60 * 60;
        
        System.out.printf("It will take %f seconds.\n", seconds);
    }
    
}
