
package ps5_q4_cc;

public class Ps5_q4_cc {

    public static void main(String[] args) {
        char myChar = '?';
        if (isLowercaseLetter(myChar))
            System.out.println(myChar + " is a lowercase letter");
        else
            System.out.println(myChar + " is not a lowercase letter");
    }
    
    public static boolean isLowercaseLetter(char ch) {
        if (ch >= 'a' && ch <= 'z')
            return true;
        else
            return false;
    }
}
