
package ps4_q2_b;
import java.util.Scanner;
public class Ps4_q2_b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the range of numbers: ");
        int range = input.nextInt();
        int total = 0;
        double square = 0, sqrroot = 0, totalSquare = 0, toralSqrroot = 0;
        
        for (int i = 0; i < range; i++){
            int number = input.nextInt();
            System.out.printf("%-3d | ", number);
            square = Math.pow(number, 2);
            sqrroot = Math.sqrt(number);
            System.out.printf("%-5.2f \t %-5.2f\n", square, sqrroot);
            total += number;
            totalSquare += square;
            toralSqrroot += sqrroot;
        }
        
        input.close();
        System.out.println("-----------------------------------------------");
        System.out.printf("%-3d | %-5.2f \t %-5.2f\n", total, totalSquare, toralSqrroot);
    }
    
}
