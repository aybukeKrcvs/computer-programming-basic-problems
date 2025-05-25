
package ps10_q1_e;

public class Ps10_q1_e {

    public static void main(String[] args) {
        int start = 5, finish = 24;
        System.out.println(countMultipleOfN(start, finish, 5, 0));
    }
    
    public static int countMultipleOfN(int start, int finish, int N, int count) {
        if (start == finish) {
            if (start % N == 0) return 1 + count;
            else return count;
        }
        return (start % N == 0 ?
                countMultipleOfN(start + 1, finish, N, count + 1) : 
                countMultipleOfN(start + 1, finish, N, count));
    }
    
}
