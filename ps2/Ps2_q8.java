
package ps2_q8;

public class Ps2_q8 {

    public static void main(String[] args) {
        int n = 2, m = 20, x = -1;
        
        if (n == 1){
            if (m  == 10)
                x = 0;
            else if (m == 20)
                x = 1;
            else if (m == 30)
                x = 2;
        }
        else if (n == 2){
            if (m == 10)
                x = 3;
            else if (m == 20)
                x = 4;
        }
        System.out.println(x);
    }
    
}
