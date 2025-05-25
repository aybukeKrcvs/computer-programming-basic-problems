
package ps10_q1_o;

public class Ps10_q1_o {

    public static void main(String[] args) {
        System.out.println(gcdRecursively(102, 30));
    }
    public static int gcdRecursively(int num1, int num2) {
        if (num2 == 0)
            return num1;
        return gcdRecursively(num2, num1 % num2);
    }
    
}
