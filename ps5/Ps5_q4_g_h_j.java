
package ps5_q4_g_h_j;

public class Ps5_q4_g_h_j {

    public static void main(String[] args) {
        double radius = 5, height = 7;
        System.out.println(volumeOfCylinder(radius, height));
        System.out.println(surfaceAreaOfCylinder(radius, height));
        System.out.println("");
        showVolumeAndSurfaceArea(radius, height);
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
    
    public static void showVolumeAndSurfaceArea(double radius, double height) {
        System.out.println("with radius " + radius + " and height " + height);
        System.out.printf("\tvolume of a cylinder: %.2f\n", volumeOfCylinder(radius, height));
        System.out.printf("\tsurface area of a cylinder: %.2f\n", surfaceAreaOfCylinder(radius, height));
        
    }
}
