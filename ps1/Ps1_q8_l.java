
package ps1_q8_l;
import java.util.Scanner;
public class Ps1_q8_l {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the grades of midterm 1, midterm 2 and final exam: ");
        double midterm1 = input.nextDouble();
        double midterm2 = input.nextDouble();
        double finalExam = input.nextDouble();
        
        final double weightMid1 = 0.25, weightMid2 = 0.30, weightFinalExam = 0.45;
        
        double average = (midterm1 * weightMid1) + 
                (midterm2 * weightMid2) + (finalExam * weightFinalExam);
        
        System.out.println("Weighted average is: " + average);
    }
    
}
