package ps4_q2_p;

import java.util.Scanner;

public class Ps4_q2_p {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int year;
        long population = 6 * (int)Math.pow(10, 9);
        
        do {            
            System.out.print("Enter a year: ");
            year = input.nextInt();
        } while (year < 2004 || year > 2050);
        input.close();
        
        if (year >= 2004 && year <= 2014)
            population += population * 0.03;
        else 
            population += population * 0.05;
        
        System.out.println("Estimated population increase: " + population);
            
            
    }
    
}
