package ps4_q2_s;

public class Ps4_q2_s {

    public static void main(String[] args) {
        System.out.println("Number\tFactorial");

        for (int i = 0; i <= 20; i++) {
            long factorial = calculateFactorial(i);
            System.out.println(i + "\t" + factorial);
        }
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    
}
