
package ps2_q9;

public class Ps2_q9 {

    public static void main(String[] args) {
        int n = 1, m = 30, x = -1;
        
        switch (n) {
            case 1:
                switch (m) {
                    case 10:
                        x = 0;
                        break;
                    case 20:
                        x = 1;
                        break;
                    case 30:
                        x = 2;
                        break;
                }
                break;
            case 2:
                switch (m){
                    case 10:
                        x = 3;
                        break;
                    case 20:
                        x = 4;
                        break;
                }
                break;
        }
        System.out.println("x = " + x);
    }
    
}
