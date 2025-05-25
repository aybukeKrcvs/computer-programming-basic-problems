
package ps6_q1_g;

import java.util.Arrays;

public class Ps6_q1_g {

    public static void main(String[] args) {
        
        int[] list1 = {6, 2, 4, 5, 9, 8, 7, 6, 3, 1};
        int[] list2 = {1, 6, 6, 7, 2, 1, 3, 8, 5, 4};
        int[] total = new int[list1.length + 2];
        
        int carry = 0;
        for (int i = (list1.length-1); i >= 0; i--){
            int temp = list1[i] + list2[i] + carry;
            int remain = temp % 10;
            carry = temp / 10;
            
            total[i+1] = remain;
            if (i == 0 && temp >= 10)
                total[i] = carry;
        }
        
        for (int i = 0; i < total.length; i++){
            if (i == 0 && total[i] == 0)
                continue;
            System.out.print(total[i]);
        }
        System.out.println();
    }
}
