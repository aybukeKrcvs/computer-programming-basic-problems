
package ps5_q4_bb;

import java.util.Scanner;

public class Ps5_q4_bb {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time in minutes: ");
        int minutes = input.nextInt();
        printTimeDuration(minutes);
    }
    
    public static void printTimeDuration(int minutes) {
        int days = minutes /(60 * 24);
        int hours = minutes % (60 * 24) / 60;
        int remainingMin = minutes % 60;
        System.out.printf("%d minutes = %d days, %d hours and %d minutes\n",
                minutes, days, hours, remainingMin);
    }
}
