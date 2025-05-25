
package ps10_q1_k;

public class Ps10_q1_k {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 7, 13, 14};
        System.out.println(lastOccurrence(arr, 7, arr.length - 1));
    }
    
    public static int lastOccurrence(int[] arr, int target, int index) {
        if (index < 0)
            return -1;
        if (arr[index] == target)
            return index;
        else
            return lastOccurrence(arr, target, index - 1);
    }
    
}
