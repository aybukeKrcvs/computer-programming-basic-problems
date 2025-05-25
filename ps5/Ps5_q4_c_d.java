
package ps5_q4_c_d;

public class Ps5_q4_c_d {

    public static void main(String[] args) {
        double fahrenheit = 32, centigrade = 100;
        System.out.printf("%.2f degrees Fahrenheit in degrees Centigrade: "
                + "%.2f\n", fahrenheit, convertToCentigrade(fahrenheit));
        
        System.out.printf("%.2f degrees Centigrade  in degrees Fahrenheit: "
                + "%.2f\n", centigrade, convertToFahrenheit(centigrade));
    }
    
    public static double convertToCentigrade(double fahrenheit) {
        double centigrade = (fahrenheit - 32) / 1.8;
        return centigrade;
    }
    
    public static double convertToFahrenheit(double centigrade){
        double fahrenheit = centigrade * 1.8 + 32;
        return fahrenheit;
    }
}
