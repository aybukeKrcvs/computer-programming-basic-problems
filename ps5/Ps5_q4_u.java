
package ps5_q4_u;

import java.util.Scanner;

public class Ps5_q4_u {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lengths of three sides of triangle: ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        
        if (IsEquileteralTriangle(side1, side2, side3))
            System.out.println("The triangle is equileteral");
        else
            System.out.println("The triangle is not equileteral");
    }
    
    public static boolean IsEquileteralTriangle(int side1, int side2, int side3) {
        return side1 == side2 && side2 == side3;
    }
}
