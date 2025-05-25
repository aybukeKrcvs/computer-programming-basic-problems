package ps2_q10_u;

import java.util.*;

public class Ps2_q10_u {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the cost of wholesale: ");
        double wholesale = input.nextDouble();
        double dealerMarkup;
        double saleTax;
        double consumerCost;

        if (wholesale < 25000) {
            dealerMarkup = wholesale * 0.12;
            saleTax = dealerMarkup * 0.06;
            consumerCost = wholesale + dealerMarkup + saleTax;
            System.out.println("Consumer's cost is " + consumerCost);
        } else {
            dealerMarkup = wholesale * 0.14;
            saleTax = dealerMarkup * 0.07;
            consumerCost = wholesale + dealerMarkup + saleTax;
            System.out.println("Consumer's cost is " + consumerCost + " YTL");
        }
        
    }

}
