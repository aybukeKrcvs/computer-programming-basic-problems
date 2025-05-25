
package ps2_q10_z;

import java.util.Scanner;

public class Ps2_q10_z {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many books does customer buy? ");
        int books = input.nextInt();
        final double PER_BOOK = 15.0, VAT = 0.12, DİSCOUNT_RATE = 0.05;
        double price = 0;
        
        if (books >= 0 && books <= 20)
            price += books * PER_BOOK * (1 + VAT);
        else{
            price += books * PER_BOOK * (1 + VAT);
            price -= price * DİSCOUNT_RATE;
        }
        
        System.out.printf("price is: %.2f\n", price);
            
    }
    
}
