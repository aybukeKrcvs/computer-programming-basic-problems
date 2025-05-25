
package ps3_q2_k;
import java.util.*;
public class Ps3_q2_k {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_STUDENTS = 3;
        int countSection1Students = 0,countSection2Students = 0;
        double totalGradeOfSection2 = 0;
        
        for(int i = 1; i <= NUMBER_OF_STUDENTS; i++){
            System.out.print("Enter the section number and quiz grade"
                    + " of " + i + ". student: ");
            int section = input.nextInt();
            double grade = input.nextDouble();
            
            switch (section) {
                case 1:
                    countSection1Students++;
                    break;
                case 2:
                    totalGradeOfSection2 += grade;
                    countSection2Students++;
                    break;
                case 3:
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
        input.close();
        double averageGrade = totalGradeOfSection2 / countSection2Students;
        System.out.println("\nnumber of students in section 1 is " + countSection1Students);
        System.out.println("average grade of students in section 2 is " + averageGrade);
    }
    
}
