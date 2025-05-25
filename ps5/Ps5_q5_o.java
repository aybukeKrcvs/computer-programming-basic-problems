
package ps5_q5_o;

import java.util.Scanner;

public class Ps5_q5_o {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        long[] id = new long[numberOfStudents];
        double[] mid1 = new double[numberOfStudents];
        double[] mid2 = new double[numberOfStudents];
        double[] finalG = new double[numberOfStudents];
        
        for (int i = 0;i < numberOfStudents;i++){
            System.out.printf("\nFor student %d:\n", (i+1));
            System.out.print("Enter the ID: ");
            id[i] = input.nextLong();
            System.out.print("Enter the midterm 1, midterm 2 and final grades respectively: ");
            mid1[i] = input.nextDouble();
            mid2[i] = input.nextDouble();
            finalG[i] = input.nextDouble();
        }
        
            System.out.println("\nAverage grade of all students: ");
            System.out.println("ID\t\tMid 1\tMid 2\tFinal\tAverage");
            System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < numberOfStudents;i++) {
            System.out.printf("%-11d\t%.2f\t%.2f\t%.2f\t%.2f\n", id[i],
                    mid1[i], mid2[i], finalG[i], calculateAverage(mid1[i], mid2[i], finalG[i]));
            
        }
        
    }
    
    public static double calculateAverage(double mid1, double mid2, double finalGrade) {
        double average = (mid1 + mid2 + finalGrade) / 3;
        return average;
    }
}
