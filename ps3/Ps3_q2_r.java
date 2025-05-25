package ps3_q2_r;

public class Ps3_q2_r {

    public static void main(String[] args) {
        final double  ORIGINAL_AMOUNT = 1000, ANNUAL_RATE = 0.05; 

        for (int year = 1; year <= 10; year++) {
            double finalAmount = ORIGINAL_AMOUNT * Math.pow(1 + ANNUAL_RATE, year);
            System.out.printf("Amount in the account at the end "
                    + "of the year %-2d: $%.2f\n", year, finalAmount);
        }
    }
    
}
