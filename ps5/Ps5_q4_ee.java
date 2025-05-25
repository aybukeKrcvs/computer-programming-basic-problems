
package ps5_q4_ee;

import java.util.Scanner;

public class Ps5_q4_ee {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a lowercase letter: ");
        char myChar = input.next().charAt(0);
        System.out.println("uppercase of " + myChar + " is " + returnUppercaseLetter(myChar));
    }
    
    public static char returnUppercaseLetter(char ch) {
        int range = (int)'A' - (int)'a';
        return (char)((int)ch + range);
    }
}
