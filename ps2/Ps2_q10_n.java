package ps2_q10_n;

import java.util.*;

public class Ps2_q10_n {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double constantFee = 9.2;
        final double costOfInTown = 0.25;
        final double costOfOutTown = 0.35;
        
        System.out.print("enter the total amount of in-town calls: ");
        int inTownCalls = input.nextInt();
        System.out.print("enter the total amount of out-town calls: ");
        int outTownCalls = input.nextInt();
        
        double totalPrice = costOfInTown * inTownCalls + costOfOutTown * outTownCalls;
        
        if (totalPrice <= constantFee)
            System.out.println("pay " + constantFee + " YTL");
        else
            System.out.println("pay " + totalPrice + " YTL");
            
    }

}
