
package ps10_q1_c;

public class Ps10_q1_c {
    
    public static void main(String[] args) {
        int[] arr = {20, 9, 15, 8, 23, 24, 0, 7, 18, 6, 17, 18, 21, 11};
        System.out.println(findMinIndex(arr, 0));
    }
    
    public static int findMinIndex(int[] arr, int low) {
        if (low == arr.length - 1)
            return low;
        int minIndex = findMinIndex(arr, low + 1);
        return (arr[low] < arr[minIndex] ? low : minIndex);
    }
}
