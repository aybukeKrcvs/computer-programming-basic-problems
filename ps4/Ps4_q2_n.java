package ps4_q2_n;

import java.util.Scanner;

public class Ps4_q2_n {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        double highestGrade = Double.MIN_VALUE;
        double lowestGrade = Double.MAX_VALUE;
        double sumOfGrades = 0;
        int countForAverage = 0;
        
        for (int i = 1;i <= students;i++){
            System.out.print("Enter the %d. student's grade: ");
            double grade = input.nextDouble();
            
            if (grade > highestGrade)
                highestGrade = grade;
            else if (grade < lowestGrade)
                lowestGrade = grade;
            
            if ( grade >= 10 && grade <= 95){
                sumOfGrades += grade;
                countForAverage++;
            }
        }
        
        input.close();
        double average = sumOfGrades / countForAverage;
        System.out.println("Highest grade: " + highestGrade + 
                        "\nLowest grade: " + lowestGrade);
        System.out.println("Average: " + average);
    }
    
}
