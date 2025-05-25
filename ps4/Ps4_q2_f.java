
package ps4_q2_f;
import java.util.*;
public class Ps4_q2_f {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the term of n: ");
        int n = input.nextInt();
        
        int firstTerm = 1, secondTerm = 1, nextTerm = firstTerm + secondTerm;
        
        if (n >= 1){
            System.out.print(firstTerm + " ");
            if (n >= 2) {
                System.out.print(secondTerm + " ");
                while (nextTerm <= n ) {
                    System.out.print(nextTerm + " ");
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                    nextTerm = firstTerm + secondTerm;
                }
            }
        }
    }
    
}
