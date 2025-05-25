package ps2_q10_f;

import java.util.*;

public class Ps2_q10_f {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the loudness of a noice in decibels: ");
        double noiceInDecibels = input.nextDouble();
        
        if (noiceInDecibels <= 50.0)
            System.out.println("quiet");
        else if (noiceInDecibels <= 70)
            System.out.println("intrusive");
        else if (noiceInDecibels <= 90)
            System.out.println("annoying");
        else if (noiceInDecibels <= 100)
            System.out.println("very annoying");
        else if (noiceInDecibels > 110)
            System.out.println("uncomfortable");
        else
            System.out.println("unknown");

    }

}
