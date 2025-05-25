
package ps4_q2_r;

import java.util.Scanner;

public class Ps4_q2_r {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        int lowRange, middleRange, highRange;
        lowRange = middleRange = highRange = 0;
        
        for (int i = 1;i <= students;i++){
            System.out.printf("Enter the %d. student's final grade: ", i);
            double grade = input.nextDouble();
            
            if (grade >= 0 && grade < 40)
                lowRange++;
            else if (grade < 70)
                middleRange++;
            else if (grade <= 100)
                highRange++;
        }
        
        input.close();
        System.out.println("\nNumber of students in range of:"
                + "\n0-39: " + lowRange
                + "\n40-69: " + middleRange
                + "\n70-100: " + highRange);
    }
    
}
