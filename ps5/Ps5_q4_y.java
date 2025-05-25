
package ps5_q4_y;

import java.util.Scanner;

public class Ps5_q4_y {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of starting organism and minimum target: ");
        int start = input.nextInt();
        int target = input.nextInt();
        int hours = calculateHours(start, target);
        
        System.out.printf("It will take %d days and %d hours to reach "
                + "%d organisms\n", (hours / 24), (hours % 24), target);
    }
    public static int calculateHours(int currentOrg, int minimumReach) {
        int hours = 0;
        while (currentOrg < minimumReach){
            currentOrg *= 2;
            hours++;
        }
        return hours;
    }
}
