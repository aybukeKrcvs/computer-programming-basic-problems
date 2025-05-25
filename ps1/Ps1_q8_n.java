
package ps1_q8_n;
import java.util.Scanner;
public class Ps1_q8_n {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the high speed and lower speed: ");
        double highSpeed = input.nextDouble();
        double lowSpeed = input.nextDouble();
        System.out.print("Enter the certain time: ");
        double time = input.nextDouble();
        
        double acceleration = (highSpeed - lowSpeed) / time;
        System.out.println("Car's constant rate of acceleration is " + acceleration);
    }
    
}
