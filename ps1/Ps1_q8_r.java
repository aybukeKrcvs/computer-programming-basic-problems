
package ps1_q8_r;
import java.util.Scanner;
public class Ps1_q8_r {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in meters: ");
        double givenMeters = input.nextDouble();
        
        int meters = (int)givenMeters % 100;
        int cm = (int)((givenMeters - meters) * 100);
        int mm = (int)((givenMeters - meters - cm * 0.01) * 1000);
        System.out.printf("%d meters  %d cm  %d mm\n", meters, cm ,mm);
                
    }
    
}
