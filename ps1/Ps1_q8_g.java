
package ps1_q8_g;
import java.util.Scanner;
public class Ps1_q8_g {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        
        final double PI = 3.1416;
        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;
        
        System.out.printf("area of the circle is %.2f\n", area);
        System.out.printf("perimeter of the circle is %.2f\n", perimeter);
    }
    
}
