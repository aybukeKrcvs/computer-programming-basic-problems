package ps2_q10_e;

import java.util.*;

public class Ps2_q10_e {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter user ID: ");
        long userId = input.nextLong();
        System.out.print("Enter the total consumption: ");
        double consumption = input.nextDouble();
        System.out.print("type D for domestic or I for industrial: ");
        char userCode = input.next().charAt(0);
        
        final double domestic = 3.0, industrial = 2.5;
        double price = 0;
        
        if (userCode == 'D' || userCode == 'd')
            price = consumption * domestic;
        else if (userCode == 'I' || userCode == 'i')
            price = consumption * industrial;
        else
            System.out.println("invalid character");
        
        System.out.println("\nuser ID: " + userId);
        System.out.println("total amount to be paid: " + price);

    }

}
