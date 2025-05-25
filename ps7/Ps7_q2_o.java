
package ps7_q2_o;
import java.util.*;
public class Ps7_q2_o {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter 10 character: ");
        char[] letters = new char[10];
        for (int i = 0; i < letters.length; i++)
            letters[i] = input.next().charAt(0);
        
        printReverseOrder(letters);
        System.out.println("");

    }
    public static void printReverseOrder(char[] letters){
        for (int i = letters.length-1; i >= 0; i--)
            System.out.print(letters[i] + " ");
    }
}
