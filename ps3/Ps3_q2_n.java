
package ps3_q2_n;
import java.util.*;
public class Ps3_q2_n {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        //number of students
        final int STUDENT = input.nextInt();
        int countPassed = 0, countFailed = 0;
        
        for (int i = 1; i <= STUDENT;i++){
            System.out.printf("Enter the %d. student's grade: ", i);
            double grade = input.nextDouble();
            
            if (grade >= 50)
                //increase the number od stu who passed the course
                countPassed++;
            else
                //increase the number od stu who failed the course
                countFailed++;
            
        }
        
        input.close();
        System.out.println("\n" + countPassed + " students are passed the course"
                + "\n" + countFailed + " students are failed the course");
    }
    
}
