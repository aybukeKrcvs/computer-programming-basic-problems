
package ps1_q8_q;
import java.util.Scanner;
public class Ps1_q8_q {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entet a three digit integer: ");
        int number = input.nextInt();
        
        int unitDigit = number % 10;
        int tenDigit = (number % 100 - unitDigit) / 10;
        int hundredDigit = (number - tenDigit - unitDigit) / 100;
        
        System.out.println(number + "\t" + hundredDigit + " " 
                + tenDigit + " " + unitDigit);
    }
    
}
