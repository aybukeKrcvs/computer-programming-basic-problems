
package ps5_q2;

public class Ps5_q2 {

    public static void main(String[] args) {
        int k, n, res;
        n = 3;
        
        for (k = n; k < n * 4; k += n + 1) {
            System.out.println(k);
            for (res = 3 * n; res >= k; res -= n) {
                System.out.println(meth(res, k));
            }
            System.out.println(res);
        }
        System.out.println(k);
    }
    
    static int meth(int n1, int n2) {
        int m;
        m = n1;
        
        while (n1 > n2) {
            m += n2;
            n2 *= 2;
        }
        return m;
    }
}
