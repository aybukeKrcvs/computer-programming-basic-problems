
package ps5_q4_b;

public class Ps5_q4_b {

    public static void main(String[] args) {
        System.out.printf("%.1f\n", convertToMilimeters(68));
    }
    
    public static double convertToMilimeters(double feet) {
        final double footToInch = 12;
        final double inchToCm = 2.54;
        final double cmToMm = 10;
        
        double newNumber;
        newNumber = feet * footToInch * inchToCm * cmToMm;
        return newNumber;
    }
}
