
package ps3_q2_c;

public class Ps3_q2_c {

    public static void main(String[] args) {
        
        for (int i = 100; i >= 50; i -= 2){
            double sqrt = Math.sqrt(i);
            System.out.printf("Square root of %-3d is %.2f\n", i, sqrt);
        }
    }
    
}
