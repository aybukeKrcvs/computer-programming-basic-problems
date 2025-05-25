
package ps10_q1_a;

public class Ps10_q1_a {

    public static void main(String[] args) {
        System.out.println(product(2, 5));
    }
    
    public static int product(int x, int y) {
        if (x == y)
            return y;
        return x++ * product(x, y);
    }
}
