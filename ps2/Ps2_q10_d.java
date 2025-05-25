package ps2_q10_d;

import java.util.*;

public class Ps2_q10_d {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your id number and amount of bill: ");
        long personsID = input.nextLong();
        double bill = input.nextDouble();
        double discount = 0; 
        
        if (bill > 100)
            discount = bill * 0.05;       
        
        double pay = bill - discount;
        
        System.out.println("customer ID: " + personsID);
        System.out.println("final amount is " + pay + ", discount was " + discount);
            
    }

}
