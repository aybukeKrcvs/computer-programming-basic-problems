
package ps9_q1_e;
import java.util.Scanner;
public class Ps9_q1_e {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the N: ");
        int N = input.nextInt();
        System.out.print("Enter the boundaries as x and y: ");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println(multiple(N, x, y));
    }
    public static int multiple(int N, int x, int y){
        if (x > y)
            return 0;
        else
            if (x % N == 0)
                return 1 + multiple(N, x+1, y);
            else
                return multiple(N, x+1, y);
    }
}
