package ps4_q2_e;
import java.util.Scanner;
public class Ps4_q2_e {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        int countPass = 0, countFail = 0;
        for (int i = 1; i <= numberOfStudents; i++){
            System.out.printf("Enter the grade of student %d: ", i);
            double grade = input.nextDouble();
            
            if (grade >= 50.0)
                countPass++;
            else
                countFail++;
        }
        
        input.close();
        System.out.printf("\n%d student(s) are passed\n", countPass);
        System.out.printf("%d student(s) are failed\n", countFail);
    }
    
}
