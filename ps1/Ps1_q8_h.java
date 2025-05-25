
package ps1_q8_h;
import java.util.Scanner;
public class Ps1_q8_h {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and the height of the cylinder: ");
        double radius = input.nextDouble();
        double height = input.nextDouble();
        final double PI = 3.1416;
        double volume = PI * radius * radius * height;
        double area = 2 * PI * radius * (radius + height);
        
        System.out.printf("volume of the cylinder is %.2f\n", volume);
        System.out.printf("total surface area of the cylinder is %.2f\n", area);
    }
    
}
