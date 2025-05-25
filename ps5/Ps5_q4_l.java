
package ps5_q4_l;

import java.util.Scanner;

public class Ps5_q4_l {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the midterm 1, midterm 2 and final grades respectively: ");
        double midterm1 = input.nextDouble();
        double midterm2 = input.nextDouble();
        double finalGrade = input.nextDouble();
        
        double average = calculateAverage(midterm1, midterm2, finalGrade);
        System.out.printf("Average grade is: %.1f\n", average);
    }
    
    public static double calculateAverage(double mid1, double mid2, double finalGrade) {
        double average = (mid1 + mid2 + finalGrade) / 3;
        return average;
    }
}
