
package ps5_q5_q;

import java.util.Scanner;

public class Ps5_q5_q {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lenghts of three sides of a triangle: ");
        double side1 = input.nextInt();
        double side2 = input.nextInt();
        double side3 = input.nextInt();
        
        if (isRightTriangle((int)side1, (int)side2, (int)side3)){
            double area = areaOfRightTriangle(side1, side2, side3);
            System.out.println("Area of the triangle is " + area + " ft^2");
        } else if (isEquileteralTriangle((int)side1, (int)side2, (int)side3)){
            side1 = convertToMilimeters(side1);
            double perimeter = side1 * 3;
            System.out.println("Perimeter of the triangle is " + perimeter + " mm");
        } else
            System.out.println("NONE!!!");
    }
    
    public static double convertToMilimeters(double feet) {
        final double footToInch = 12;
        final double inchToCm = 2.54;
        final double cmToMm = 10;
        
        double newNumber;
        newNumber = feet * footToInch * inchToCm * cmToMm;
        return newNumber;
    }
    
    public static boolean isEquileteralTriangle(int side1, int side2, int side3) {
        return side1 == side2 && side2 == side3;
    }
    
    public static boolean isRightTriangle(int side1, int side2, int side3) {
        int sqrSide1 = side1 * side1;
        int sqrSide2 = side2 * side2;
        int sqrSide3 = side3 * side3;
        return sqrSide1 == sqrSide2 + sqrSide3 ||
                sqrSide2 == sqrSide1 + sqrSide3 ||
                sqrSide3 == sqrSide1 + sqrSide2;
    }
    
    public static double areaOfRightTriangle(double side1, double side2, double side3) {
        double area = -1;
        if (side1 > side2 && side1 > side3)
            area = side2 * side3 / 2.0;
        else if (side2 > side1 && side2 > side3)
            area = side1 * side3 / 2.0;
        if (side3 > side1 && side3 > side2)
            area = side2 * side1 / 2.0;
        return area;
    }
}
