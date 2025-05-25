
package ps4_q2_a;

public class Ps4_q2_a {

    public static void main(String[] args) {
        
        double term = 1.0, total = 0.0;
        int index = 1;
        
        do {      
            if (index % 2 == 0)
                total -= term;
            else 
                total += term;
            term = 1.0 / index;
            index++;
        } while (term >= 0.00025);

        System.out.println("Sum of the series is " + total);
    }
    
}
