package ps2_q10_l;

import java.util.*;

public class Ps2_q10_l {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the name of figure(S for square, T for triangle): ");
        char figureName = input.next().charAt(0);
        double area = 0;
        
        if (figureName == 'S' || figureName == 's'){
            System.out.print("Enter the side lenght: ");
            double side = input.nextDouble();
            area = side * side;
        }else if (figureName == 'T' || figureName == 't'){
            System.out.print("Enter the base lenght: ");
            double base = input.nextDouble();
            System.out.print("Enter the height lenght: ");
            double height = input.nextDouble();
            area = base * height / 2;
        }else 
            System.out.println("INVALID CHARACTER");
        
        System.out.println("Area: " + area);
    }

}
