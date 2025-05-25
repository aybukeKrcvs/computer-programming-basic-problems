
package ps2_q10_r;

import java.util.Scanner;

public class Ps2_q10_r {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lengths of three sides of a triangle: ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        
        if (side1 == side2 && side2 == side3)
            System.out.println("the triangle is equilateral");
        else if ((side1 == side2) || (side1 == side3) || (side2 == side3))
            System.out.println("the triangle is isosceles");
        else
            System.out.println("the triangle is scalene");
    }
    
}
