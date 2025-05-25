
package ps1_q8_a;
import java.util.Scanner;
public class Ps1_q8_a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of dollars: ");
        double dollar = input.nextDouble();
        
        double dollarToLira = 30.20;
        double turkishLira = dollar * dollarToLira;
        System.out.printf("%.2f dollar equals %.2f Turkish liras.\n", dollar, turkishLira);
    }
    
}
