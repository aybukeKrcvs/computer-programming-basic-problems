
package ps9_q1_g;
import java.util.Scanner;
public class Ps9_q1_g {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String number = input.nextLine();
        int end = number.length()-1;
        reverseOrder(number, end);
        System.out.println();
    }
    public static String reverseOrder(String number, int end){
        if (end < 0)
            return number;
        else{
            System.out.print(number.charAt(end));
            return reverseOrder(number, end-1);
        }
    }
}
