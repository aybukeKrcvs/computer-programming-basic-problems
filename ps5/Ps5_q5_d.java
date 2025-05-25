
package ps5_q5_d;

import java.util.Scanner;

public class Ps5_q5_d {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minutes;
        do {
            System.out.print("Enter time in minutes: ");
            minutes = input.nextInt();
            
            if (minutes == -1)
                break;
            
            printTimeDuration(minutes);
            System.out.println("");
        } while(true);
    }
    
    public static void printTimeDuration(int minutes) {
        int days = minutes /(60 * 24);
        int hours = minutes % (60 * 24) / 60;
        int remainingMin = minutes % 60;
        System.out.printf("%d minutes = %d days, %d hours and %d minutes\n",
                minutes, days, hours, remainingMin);
    }
}
