
package ps2_q10_w;
import java.util.*;
public class Ps2_q10_w {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the vehicle type: ");
        char vehicle = input.next().charAt(0);
        System.out.print("How mant minutes has stayed in the lot? ");
        int minute = input.nextInt();
        int hours = (int)Math.ceil(minute / 60.0);
        double cost = 0;
        
        switch (vehicle){
            case 'C':
            case 'c':
                if (hours <= 2)
                    cost = 0;
                else if (hours <= 5)
                    cost = 0.50 * (hours - 2);
                else if (hours <= 15)
                    cost = 1.50 + 0.25 * (hours - 5);
                break;
            case 'T':
            case 't':
                if (hours <= 1)
                    cost = 0;
                else if (hours <= 3)
                    cost = 1.0 * (hours - 1);
                else if (hours <= 15)
                    cost = 2.0 + 0.75 * (hours - 3);
                break;
            case 'S':
            case 's':
                cost = 0;
                break;
                default:
                    System.out.println("Invalid vehicle type!");
        }
        System.out.printf("Charge: %.2f\n", cost);
    }
    
}
