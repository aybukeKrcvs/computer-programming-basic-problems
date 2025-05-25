
package ps5_q4_ff;

import java.util.Scanner;

public class Ps5_q4_ff {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a uppercase letter: ");
        char myChar = input.next().charAt(0);
        System.out.println("lowercase of " + myChar + " is " + returnLowercaseLetter(myChar));
    }
    
    public static char returnLowercaseLetter(char ch) {
        int range = (int)'A' - (int)'a';
        return (char)((int)ch - range);
    }
}
