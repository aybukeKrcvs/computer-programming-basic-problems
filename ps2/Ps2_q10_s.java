
package ps2_q10_s;

import java.util.Scanner;

public class Ps2_q10_s {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lengths of three sides of a triangle: ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        
        boolean isRightTriangle = false;
        
        if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2))
            isRightTriangle = true;
        else if (Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2))
            isRightTriangle = true;
        else if (Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2))
            isRightTriangle = true;
    
        if (isRightTriangle)
            System.out.println("the triangle is right-triangle");
        else
            System.out.println("the triangle is not right-triangle");
    }
    
}
