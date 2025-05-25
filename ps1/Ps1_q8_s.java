
package ps1_q8_s;

import java.util.Scanner;

public class Ps1_q8_s {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the minutes: ");
        int givenMinutes = input.nextInt();
        
        int days = givenMinutes / 60 / 24;
        int hours = givenMinutes / 60 % 24;
        int minutes = givenMinutes % 60 % 24;
        System.out.printf("%d days  %d hours  %d min\n", days, hours, minutes);
    }
    
}
