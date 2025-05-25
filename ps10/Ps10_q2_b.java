
package ps10_q2_b;

public class Ps10_q2_b {

    public static void main(String[] args) {
        String str = "THE EXAM IS VERY EASY";
        recursiveStr(str, 0, str.length());
        System.out.println("");
    }
    
    public static void recursiveStr(String str, int step, int high) {
        printString(str, step, high);
        if (str.length() - step == 1)
            return;
        else {
            System.out.println("");
            recursiveStr(str, step + 1, high-1);
        }
    }
    
    public static void printString(String str, int low, int high) {
        if (low >= high)
            return;
        
        System.out.print(str.charAt(low));
        printString(str, low+1, high);
    }
    
}
