
package ps5_q4_r;

public class Ps5_q4_r {

    public static void main(String[] args) {
        int x = 7;
        int y = 15;
        
        System.out.printf("Absolute difference of %d and %d is %d\n"
                , x, y, absoluteDifference(x, y));
    }
    public static int absoluteDifference(int num1, int num2) {
        if (num1 >= num2)
            return num1 - num2;
        else
            return num2 - num1;
    }
}
