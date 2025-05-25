package ps2_q5;

public class Ps2_q5 {

    public static void main(String[] args) {
        int n1 = 25, n2 = 50;
        
        if(n1 < n2 && !(n2 != 2*n1)){
            n1 = n1 *2;
            n2 = n2 *2;
            System.out.printf("%d %d\n", n1, n2);
        }
        if (n2 < 2 * n1 || n1 == n2)
            n1 = n1 / 2;
            n2 = n2 / 2;
            System.out.printf("%d %d\n", n1, n2);
            
            
            
            int a = -5;
            if (a > 0)
                if (a < 40)
                    System.out.printf("\nYES");
            else
                System.out.printf("\nNO");
            System.out.printf("\n%d\n", a);
            
            
            
            int b = 50;
            if (b > 0)
                if (b < 40)
                    System.out.printf("\nYES");
            else
                System.out.printf("\nNO");
            System.out.printf("\n%d\n", b);
    }

}
