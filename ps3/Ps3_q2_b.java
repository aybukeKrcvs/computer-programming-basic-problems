
package ps3_q2_b;

public class Ps3_q2_b {

    public static void main(String[] args) {
        
        for (int i = 5; i <= 50; i += 2){
            int square = (int) Math.pow(i, 2);
            System.out.printf("Square of %-2d is %d\n", i, square);
        }
    }
    
}
