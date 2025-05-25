
package ps5_q5_b;

import java.util.Scanner;

public class Ps5_q5_b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of a cylinder in feet: ");
        double height = convertToMilimeters(input.nextDouble());
        System.out.print("Enter the radius of a cylinder in milimeters: ");
        double radius = input.nextDouble();
        System.out.print("Enter (V) for volume, (S) for surface area: ");
        char letter = input.next().charAt(0);
        
        switch (letter) {
            case 'V':
            case 'v':
                System.out.printf("\nVolume of a cylinder with radius %.1f and "
                    + "height %.1f is %.1f\n", radius, height,
                    volumeOfCylinder(radius, height));
                break;
            case 'S':
            case 's':
                System.out.printf("\nSurface area of a cylinder with radius %.1f and "
                    + "height %.1f is %.1f\n", radius, height,
                    surfaceAreaOfCylinder(radius, height));
                break;
            default:
                System.out.println("\nInvalid value!!!");
                break;
        }
        
    }
    
    public static double convertToMilimeters(double feet) {
        final double footToInch = 12;
        final double inchToCm = 2.54;
        final double cmToMm = 10;
        
        double newNumber;
        newNumber = feet * footToInch * inchToCm * cmToMm;
        return newNumber;
    }
    
    public static double areaOfCircle(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
    
    public static double perimeterOfCircle(double radius) {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    
    public static double volumeOfCylinder(double radius, double height) {
        double volume = height * areaOfCircle(radius);
        return volume;
    }
    
    public static double surfaceAreaOfCylinder(double radius, double height) {
        double surfaceArea = 2 * areaOfCircle(radius)
                + perimeterOfCircle(radius) * height;
        return surfaceArea;
    }
}
