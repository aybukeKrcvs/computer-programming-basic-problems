
package ps2_q10_x;

import java.util.Scanner;

public class Ps2_q10_x {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the carpet(in m^2): ");
        int size = input.nextInt();
        double price = 0.0;
        final double PER_SQUARE = 8.5, PER_WORKER = 35, TAX_RATE = 0.08, DİSC_RATE = 0.15;
        
        if (size > 0 && size <= 40)
            price = size * PER_SQUARE * (1 + TAX_RATE) - PER_WORKER * 1;
        else if (size <= 50)
            price = size * PER_SQUARE * (1 + TAX_RATE) - PER_WORKER * 2;
        else if (size > 50){
            price = size * PER_SQUARE * (1 + TAX_RATE);
            double discount = price * DİSC_RATE;
            price = price - discount - PER_WORKER * 2;
        }
        
        System.out.printf("total price for the carpet: %.2f\n", price);    
        
    }
    
}
