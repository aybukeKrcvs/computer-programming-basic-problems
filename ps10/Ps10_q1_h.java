
package ps10_q1_h;

public class Ps10_q1_h {

    public static void main(String[] args) {
        String str = "abcd";
        reverseOrder(str, str.length() - 1);
        System.out.println("");
    }
    
    public static void reverseOrder(String str, int index) {
        if (index == -1)
            return;
        System.out.print(str.charAt(index));
        reverseOrder(str, index - 1);
    }
}
