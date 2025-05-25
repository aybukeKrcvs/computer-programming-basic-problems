
package ps5_q4_dd;

public class Ps5_q4_dd {

    public static void main(String[] args) {
        char myChar = 'P';
        if (isUppercaseLetter(myChar))
            System.out.println(myChar + " is a uppercase letter");
        else
            System.out.println(myChar + " is not a uppercase letter");
    }
    
    public static boolean isUppercaseLetter(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            return true;
        else
            return false;
    }
}
