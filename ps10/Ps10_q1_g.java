
package ps10_q1_g;

public class Ps10_q1_g {

    public static void main(String[] args) {
        int number = 1234;
        reverseOrder(number);
        System.out.println("");
    }
    
    public static void reverseOrder(int num) {
        if(num == 0)
            return;
        int lastDigit = num % 10;
        System.out.print(lastDigit);
        reverseOrder(num / 10);
    }
}
