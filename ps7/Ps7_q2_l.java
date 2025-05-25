
package ps7_q2_l;

public class Ps7_q2_l {

    public static void main(String[] args) {
        
        int[] a = {5, -3, 10, 7, -8, 15, -6, 20, -1, 7};
        int[] b = {-2, 8, -5, 12, 3, -2, 6, 15, 18, -4};
        
        System.out.println("Dot Product of A and B = " + dotProduct(a, b));
    }
    public static int dotProduct(int[] a, int[] b){
        int product = 0;
        for (int i = 0; i < a.length || i < b.length; i++)
            product += a[i] * b[i];
        return product;
    }
}
