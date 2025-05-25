
package ps5_q3;

public class Ps5_q3 {

    public static void main(String[] args) {
        System.out.println("question 1: " + meth(2));
        System.out.println("question 2: " + meth(5));
        System.out.println("question 3: " + meth(0));
        System.out.println("question 4: " + meth(8));
    }
    
    static int meth(int a) {
        int b, c, k, d;
        b = a + (int)Math.sqrt(a + a / 2 * 2);
        d = b - a;
        c = (int)Math.pow(d, 2);
        
        for (k = 0; k < b - a; k++){
            if (c == d * (b - a))
                d /= 2;
            else
                return -1;
        }
        c /= 2;
        return (c + d);
    }
}
