
package ps7_q1;

public class Ps7_q1 {

    public static void main(String[] args) {
        int[] m = {3, 1, -3, 8, 0, -4, 2};
        int[] n = {2, 4, -1, 2, 4, 3, 0};
        int[] l = {4, -1, -2, 0, 5, -2, 10};
        
        System.out.println("meth1(m, n, 7) = " + meth1(m, n, 7) + 
                        "\nmeth1(l, m, 5) = " + meth1(l, m, 5) +
                        "\nmeth1(n, l, 6) = " + meth1(n, l, 6) +
                        "\nmeth1(4, n, 4) = " + meth1(n, n, 4));
    }
    static int meth1(int[] x, int[] y, int z) {
        int v = 0, k;
        for (k = 0;k < z;k++)
            v += x[k] * y[k];
        return v;
    }
        
}
