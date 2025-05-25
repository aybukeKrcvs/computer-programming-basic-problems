
package ps5_q5_k;

public class Ps5_q5_k {

    public static void main(String[] args) {
        
        System.out.printf("temp in Fahrenheit\ttemp in Centigrade\n");
        System.out.println("---------------------------------------------");
        for (int i = 0;i <= 100;i += 5){
            System.out.printf("%9d\t\t%10.1f\n", i, convertToCentigrade(i));
        }
    }
    
    public static double convertToCentigrade(double fahrenheit) {
        double centigrade = (fahrenheit - 32) / 1.8;
        return centigrade;
    }
}
