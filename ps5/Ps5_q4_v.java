
package ps5_q4_v;

import java.util.Scanner;

public class Ps5_q4_v {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lengths of three sides of triangle: ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        
        if (IsRightTriangle(side1, side2, side3))
            System.out.println("The triangle is right-triangle");
        else
            System.out.println("The triangle is not right-triangle");
    }
    
    public static boolean IsRightTriangle(int side1, int side2, int side3) {
        int sqrSide1 = side1 * side1;
        int sqrSide2 = side2 * side2;
        int sqrSide3 = side3 * side3;
        return sqrSide1 == sqrSide2 + sqrSide3 ||
                sqrSide2 == sqrSide1 + sqrSide3 ||
                sqrSide3 == sqrSide1 + sqrSide2;
    }
}
