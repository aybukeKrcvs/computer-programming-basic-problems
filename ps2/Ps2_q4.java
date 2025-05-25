package ps2_q4;

import java.util.Scanner;

public class Ps2_q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("QUESTİON A");
        System.out.print("enter the grade: ");
        double grade = input.nextDouble();
        
        if (grade > 80 && grade <= 90){
            System.out.println("B");
        }
        
        
        
        
        System.out.println("QUESTİON B");
        System.out.print("enter the value of x:");
        double x = input.nextDouble();
        if (x < 2 || x > 5){
            double y = x + 1;
            System.out.println("y is " + y);
        }else
            System.out.println("x is " + x);
        
        
        
        System.out.println("QUESTİON C");
        System.out.print("enter the grade: ");
        double grade1 = input.nextDouble();
        if (grade1 <= 50)
            System.out.println("Unsuccessful");

    }

}
