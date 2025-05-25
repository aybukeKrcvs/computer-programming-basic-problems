
package ps5_q5_c;

import java.util.Scanner;

public class Ps5_q5_c {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cylinders: ");
        int numberOfCylinder = input.nextInt();
        
        for (int i = 1;i <= numberOfCylinder;i++) {
            System.out.print("Enter the radius and height of the cylinder " + i + ": ");
            double radius = input.nextDouble();
            double height = input.nextDouble();
            System.out.println("---------------------------------------------------");
            
            System.out.println("");
            displayAll(radius, height);
            System.out.println("\n");
        }
    }
    public static void displayAll(double radius, double height){
        System.out.println("radius: " + radius + 
                "\nbase area: " + areaOfCircle(radius) + 
                "\nbase perimeter: " + perimeterOfCircle(radius) + 
                "\nheight: " + height + 
                "\nvolume: " + volumeOfCylinder(radius, height) + 
                "\nsurface area: " + surfaceAreaOfCylinder(radius, height));
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
