
package ps4_q2_m;

public class ps4_q2_m2 {
    public static void main(String[] args) {
        
        double sumOfSquares = 0, counter = 1.0;
        
        while (counter <= 100.0){
            sumOfSquares += Math.pow(counter, 2);
            counter += 0.2;
        }

        System.out.printf("Sum of squares of number "
                + "from 1 to 100: %.2f\n", sumOfSquares);
    }
}
