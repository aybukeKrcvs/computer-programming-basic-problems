
package ps10_q1_m;

import java.util.Arrays;

public class Ps10_q1_m {

    public static void main(String[] args) {
        int[] arr = {90, 16, 8, 15, 35, 17, 15, 8, 42, 16, 35, 90, 16, 17};
        selectionSort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void selectionSort(int[] arr, int low) {
        if (low >= arr.length)
            return;
        int minIndex = findMinIndex(arr, low);
        int min = arr[minIndex];
        arr[minIndex] = arr[low];
        arr[low] = min;
        
        selectionSort(arr, low + 1);
    }
    public static int findMinIndex(int[] arr, int low) {
        int min = low;
        for(int i = low+1;i < arr.length;i++) {
            if (arr[i] < arr[min])
                min = i;
        }
        return min;
    }
}
