
package ps7_q2_m;
import java.util.*;
public class Ps7_q2_m {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] letters = {'z', 'q', 'x', 'l', 'p', 'n', 'o', 'm', 'r', 's', 'a', 'b', 'c'};
        
        System.out.print("Enter a sentinel value: ");
        char sentinal = input.next().charAt(0);
        
        int i = 0;
        while (i < letters.length) {
            if (sentinal != letters[i] || i == letters.length-1){
                System.out.print(letters[i++] + " ");
                if (i == letters.length-1){
                    System.out.println("\nThere is no such a value in the list");
                    System.exit(0);
                }
            }
            else if (sentinal == letters[i]){
                System.out.println(letters[i] + "");
                System.exit(0);
            }
        }
    }

}
