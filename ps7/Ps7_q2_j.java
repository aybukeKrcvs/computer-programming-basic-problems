
package ps7_q2_j;
import java.util.*;
public class Ps7_q2_j {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dizi = {6, -3, 15, -24, 35, 2, 67, 9, 11, -18};
        
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int position = findPosition(number, dizi);
        
        if (position == -1)
            System.out.printf("Number %d is not in the array\n", number);
        else
            System.out.printf("Position of %d is %d\n", number, position);
            
    }
    public static int findPosition(int num, int[] dizi){
        int index;
        for (int i = 0; i < dizi.length; i++)
            if (num == dizi[i])
                return index = i;
                
        return -1;
    }
}
