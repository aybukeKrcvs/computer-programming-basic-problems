
package ps10_q2_a;

public class Ps10_q2_a {

    public static void main(String[] args) {
        recursiveStr("THE EXAM", 0);
        System.out.println("");
    }
    
    public static void recursiveStr(String str, int step) {
        printString(str, step);
        if (str.length() - step == 1)
            return;
        else {
            System.out.println("");
            recursiveStr(str, step + 1);
        }
    }
    
    public static void printString(String str, int low) {
        if (low >= str.length())
            return;
        
        System.out.print(str.charAt(low));
        printString(str, low+1);
    }
}
