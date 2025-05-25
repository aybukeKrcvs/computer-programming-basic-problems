package ps3_q2_p;

import java.util.*;

public class Ps3_q2_p {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        final int STUDENTS = input.nextInt();
        int a = 0, b = 0, c = 0, d = 0, f = 0;

        System.out.println("Enter the letter grade for each student: ");

        for (int i = 1; i <= STUDENTS; i++) {
            System.out.printf("Student %d: ", i);
            char letterGrade = input.next().charAt(0);

            switch (letterGrade) {
                case 'A':
                case 'a':
                    a++;
                    break;
                case 'B':
                case 'b':
                    b++;
                    break;
                case 'C':
                case 'c':
                    c++;
                    break;
                case 'D':
                case 'd':
                    d++;
                    break;
                case 'F':
                case 'f':
                    f++;
                    break;
                default:
                    System.out.println("invalid value!!");
            }
        }
        
        input.close();
        System.out.println("Number of A is " + a
                + "\nNumber of B is " + b
                + "\nNumber of C is " + c
                + "\nNumber of D is " + d
                + "\nNumber of F is " + f);

    }

}
