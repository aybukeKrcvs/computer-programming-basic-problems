
package ps5_q1;

public class Ps5_q1 {

    public static void main(String[] args) {
        
       int question1 = meth(876);
       int question2 = meth(9056);
       int question3 = meth(9);
       int question4 = meth(22222);
       
        System.out.println("Question 1 = " + question1 +
                            "\nQuestion 2 = " + question2 +
                            "\nQuestion 3 = " + question3 +
                            "\nQuestion 4 = " + question4 );
    }
    
    static int meth(int n){
        int d, s;
        s = 0;
        
        while (n > 0){
            d = n % 10;
            s += d;
            n /= 10;
        }
        return s;
    }
}
