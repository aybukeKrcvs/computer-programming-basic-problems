
package ps6_q1_h;
import java.util.*;
public class Ps6_q1_h {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        
        System.out.println("Enter 5 integer for each A and B vectors: ");
        for (int i = 0; i < a.length; i++){
            a[i] = input.nextInt();
        }
        
        int dotProduct = 0;
        for (int i = 0; i < b.length; i++){
            b[i] = input.nextInt();
            c[i] = a[i] + b[i];
            dotProduct += a[i] * c[i];
        }
        
        System.out.println("Dot Product of A and C = " + dotProduct);
    }
    
}
