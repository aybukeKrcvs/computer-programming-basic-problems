
package ps4_q2_m;

public class Ps4_q2_m1 {

    public static void main(String[] args) {
        
        double sumOfSquares = 0;
        for (double i = 1;i <= 100;i += 0.2){
            sumOfSquares += Math.pow(i, 2);
        }
        
        System.out.printf("Sum of squares of number "
                + "from 1 to 100: %.2f\n", sumOfSquares);
    }
    
}
