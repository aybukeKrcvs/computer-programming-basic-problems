
package ps1_q8_k;
import java.util.Scanner;
public class Ps1_q8_k {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the grades of midterm 1, midterm 2 and final exam: ");
        double midterm1 = input.nextDouble();
        double midterm2 = input.nextDouble();
        double finalExam = input.nextDouble();
        
        double averageGrade = (midterm1 + midterm2 + finalExam) / 3;
        System.out.println("Average grade is: " + averageGrade);
    }
    
}
