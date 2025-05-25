package ps4_q2_o;

import java.util.Scanner;

public class Ps4_q2_o {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of a set: ");
        int numberOfSet = input.nextInt();
        int count25, count67, count78;
        count25 = count67 = count78 = 0;
        
        for (int i = 1;i <= numberOfSet;i++){
            System.out.printf("Enter the value of %d. number: ", i);
            int number = input.nextInt();
            
            switch (number) {
                case 25:
                    count25++;
                    break;
                case 67:
                    count67++;
                    break;
                case 78:
                    count78++;
                    break;
            }
        }
        
        input.close();
        System.out.println("In a set of positive numbers:\n"
                + "Number of 25: " + count25
                + "Number of 67: " + count67
                + "Number of 78: " + count78);
    }
    
}
