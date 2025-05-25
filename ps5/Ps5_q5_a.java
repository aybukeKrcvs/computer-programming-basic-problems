
package ps5_q5_a;

import java.util.Scanner;

public class Ps5_q5_a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the diameter of a circle: ");
        double radius = input.nextInt() / 2.0;
        System.out.print("Enter a letter (A) for area, (P) for perimeter: ");
        char myChar = input.next().charAt(0);
        
        switch (myChar) {
            case 'A':
            case 'a':
                System.out.printf("\nArea of the circle with radius %.1f is"
                    + " %.1f\n", radius, areaOfCircle(radius) );
                break;
            case 'P':
            case 'p':
                System.out.printf("\nPerimeter of the circle with radius %.1f is"
                    + " %.1f\n", radius, perimeterOfCircle(radius) );
                break;
            default:
                System.out.println("\nInvalid value!!!");
                break;
        }
        
    }
    
    public static double areaOfCircle(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
    
    public static double perimeterOfCircle(double radius) {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
