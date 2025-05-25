
package ps5_q4_e_f_i;

public class Ps5_q4_e_f_i {

    public static void main(String[] args) {
        double radius = 5;
        System.out.println(areaOfCircle(radius));
        System.out.println(perimeterOfCircle(radius));
        System.out.println("");
        showAreaAndPerimeter(radius);
        
    }
    
    public static double areaOfCircle(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
    
    public static double perimeterOfCircle(double radius) {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    
    public static void showAreaAndPerimeter(double radius) {
        System.out.println("with radius " + radius);
        System.out.printf("\tarea of a circle: %.2f\n", areaOfCircle(radius));
        System.out.printf("\tpeirmeter of a circle: %.2f\n", perimeterOfCircle(radius));
        
    }
}
