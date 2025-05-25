
package ps10_q1_n;

import java.util.Arrays;

public class Ps10_q1_n {

    public static void main(String[] args) {
        int[] arr = {90, 16, 8, 15, 35, 17, 15, 8, 42, 16, 35, 90, 16, 17};
        bubbleSort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void bubbleSort(int[] arr, int i) {
        if (i >= arr.length)
            return;
        for (int j = 1;j < arr.length - i;j++) {
            if (arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
        bubbleSort(arr, i + 1);
    }
    
    
}
