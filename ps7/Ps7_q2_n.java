
package ps7_q2_n;
import java.util.*;
public class Ps7_q2_n {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char[] letter = new char[10];
        
        System.out.println("Enter 10 character: ");
        for (int i = 0; i < letter.length; i++)
            letter[i] = input.next().charAt(0);
        display(letter);
    }
    public static void display(char[] letter){
        
        for (int i = 0; i < letter.length; i++)
            System.out.print(letter[i] + " ");
        System.out.println();
    }
}
