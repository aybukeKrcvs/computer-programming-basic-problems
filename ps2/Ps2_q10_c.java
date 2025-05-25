package ps2_q10_c;

import java.util.*;

public class Ps2_q10_c {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the overall grade of a student: ");
        double grade = input.nextDouble();

        if (grade < 50) {
            System.out.println("Student failed!!");
        } else {
            System.out.println("Student passed!!");
        }
    }

}
