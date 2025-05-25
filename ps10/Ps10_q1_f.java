
package ps10_q1_f;

public class Ps10_q1_f {

    public static void main(String[] args) {
        int start = 5, finish = 10;
        System.out.println(countMultipleOfN(start, finish, 2, 0));
    }
    public static int countMultipleOfN(int start, int finish, int N, int sum) {
        if (start == finish) {
            if (start % N == 0) return start + sum;
            else return sum;
        }
        return (start % N == 0 ?
                countMultipleOfN(start + 1, finish, N, sum + start) : 
                countMultipleOfN(start + 1, finish, N, sum));
    }
}
