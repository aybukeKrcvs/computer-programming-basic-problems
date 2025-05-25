
package ps6_q1_e;
import java.util.*;
public class Ps6_q1_e {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] myList = new int[15];
       
        System.out.print("Enter the values of 15 numbers: ");
        for (int i = 0; i < myList.length; i++)
            myList[i] = input.nextInt();
        
        int previous = myList[0];
        for (int i = 1; i < myList.length; i++){
            if (previous < myList[i]){
                previous = myList[i];  
                continue;
            } else {
                System.out.println("invalid ordered list!!");
                System.exit(0);
            }
        }
        
        printReversed(myList);
        System.out.println("");
    }
    public static void printReversed(int[] list) {
        for (int i = list.length - 1;i >= 0;i--)
            System.out.print(list[i] + " ");
    }
    
}
