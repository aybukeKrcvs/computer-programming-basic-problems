package ps2_q10_h;

import java.util.*;

public class Ps2_q10_h {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the letter grade of a student: ");
        char grade = input.next().charAt(0);
        
        switch (grade) {
            case 'A':
                System.out.println("high honor");
                break;
            case 'B':
                System.out.println("honor");
                break;
            case 'C':
                System.out.println("satisfactory");
                break;
            case 'D':
                System.out.println("poor");
                break;
            default:
                System.out.println("fail");
                break;
        }
    }

}
