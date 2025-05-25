
package ps3_q2_g;
import java.util.*;
import java.lang.*;
public class Ps3_q2_g {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0, sumSquare = 0, sumSquareRoot = 0;
        
        for (int i = 1; i <= 3; i++){
            System.out.print("Enter the value of number " + i + ": ");
            double number = input.nextDouble();
            double numberSquare = Math.pow(number, 2);
            double numberSquareRoot = Math.sqrt(number);
            
            sum += number;
            sumSquare += numberSquare;
            sumSquareRoot += numberSquareRoot;
            
            System.out.printf("%.2f %.2f %.2f\n", number, numberSquare, numberSquareRoot);
        }
        
        input.close();
        System.out.print("\nThe sum of the numbers " + sum +
                 "\nThe sum of numbers of square "+ sumSquare +
                 "\nThe sum of numbers of square roots " + sumSquareRoot + "\n");
    }
    
}
