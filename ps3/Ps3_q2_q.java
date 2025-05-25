
package ps3_q2_q;
import java.util.Scanner;
public class Ps3_q2_q {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        final int STUDENTS = input.nextInt();
        
        for(int i = 1;i <= STUDENTS;i++){
            System.out.printf("Enter the details for student %d:", i);
            System.out.print("\nStudent ID: ");
            long id = input.nextLong();
            System.out.print("Enter midterm 1, midterm 2 and final grade: ");
            double midterm1 = input.nextDouble();
            double midterm2 = input.nextDouble();
            double finalExam = input.nextDouble();
            
            double average = (midterm1 + midterm2 + finalExam)/3;
            
            System.out.print("\nStudent " + id + " - average grade: " + average);
            
            if (average >= 50)
                System.out.println(" - PASS\n");
            else 
                System.out.println(" - FAİL");
            System.out.println("----------------------------------------------------");
        }
    }
    
}
