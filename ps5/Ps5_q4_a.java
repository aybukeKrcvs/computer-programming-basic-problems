
package ps5_q4_a;

public class Ps5_q4_a {

    public static void main(String[] args) {
        System.out.printf("%.2f\n", fractionalPart(35.08));
    }
    
    public static double fractionalPart(double number) {
        double newNumber;
        
        newNumber = number - (int)number;
        return newNumber;
    }
}
