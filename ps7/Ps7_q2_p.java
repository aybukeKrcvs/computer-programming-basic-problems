
package ps7_q2_p;
import java.util.*;
public class Ps7_q2_p {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] letters = {'a', 'b', 'c','d', 'e', 'f','g', 'h', 'i'};
        
        System.out.print("Enter a character to search: ");
        char ch = input.next().charAt(0);
        
        
        
        if (isExist(letters, ch))
            System.out.printf("character %c exists in the array\n", ch);
        else
            System.out.printf("character %c does not exist in the array\n", ch);
    }
    public static boolean isExist(char[] letter, char ch){
        for (int i = 0; i < letter.length; i++){
            if (ch == letter[i])
                return true;
        }
        return false;
    }
}
