
package ps7_q2_k;
import java.util.*;
public class Ps7_q2_k {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {2, 3, 4, 3, 7, 2, 6, 2, 7, 2, 8};
        
        System.out.print("Enter the target number: ");
        int target = input.nextInt();
        
        int countTarget = countOccurence(target, numbers);
        System.out.println("the number of occurence of " + target 
                + " is " + countTarget + " in the array");
    }
    public static int countOccurence(int target, int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (target == arr[i])
                count++;
        return count;
    }
}
