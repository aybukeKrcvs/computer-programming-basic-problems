
package ps4_q2_q;

import java.util.Scanner;
public class Ps4_q2_q {

public class TheatreTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTicketsSold = 900;
        double ticketPrice = 15.0;
        double discountRate = 0.1;

        System.out.println("Enter the number of cases:");
        int cases = scanner.nextInt();

        double totalIncome = 0;

        for (int i = 0; i < cases; i++) {
            System.out.println("Enter person's ID:");
            int personID = scanner.nextInt();

            System.out.println("Enter the number of tickets bought:");
            int ticketsBought = scanner.nextInt();

            double totalPrice;

            if (ticketsBought > 15) {
                double discountAmount = ticketsBought * ticketPrice * discountRate;
                totalPrice = ticketsBought * ticketPrice - discountAmount;
            } else {
                totalPrice = ticketsBought * ticketPrice;
            }

            totalIncome += totalPrice;

            System.out.println("Person ID: " + personID);
            System.out.println("Total amount to pay: " + totalPrice + " YTL\n");
        }

        System.out.println("Total income of the theatre: " + totalIncome + " YTL");
    }
}

    
}
