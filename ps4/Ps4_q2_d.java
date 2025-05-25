
package ps4_q2_d;
import java.util.Scanner;
public class Ps4_q2_d {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many numbers to enter: ");
        int numberOfItem = input.nextInt();
        int countNegative = 0, countPositive = 0;
        double[] numbers = new double[numberOfItem];
        
        for (int i = 0; i < numberOfItem; i++){
            System.out.print("Enter the number " + (i+1) + ": ");
            double num = input.nextDouble();
            
            numbers[i] = num;
            if (num > -250 && num < 0)
                countNegative++;
            if (num > 0 && ((num - (int)num) > 0.25))
                countPositive++;
        }
        
        input.close();
        System.out.println("");
        for (int i = 0; i < numberOfItem; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nnumber of negative values: " + countNegative);
        System.out.println("number of positive values whose "
                + "fractional part is greater than 0.25: " + countPositive);
        
    }
    
}
