
package ps10_q1_l;

public class Ps10_q1_l {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 7, 8, 11, 14, 18};
        System.out.println(findLastOccurrence(arr, 7, 0));
    }
    public static int findLastOccurrence(int[] arr, int target, int index) {
        if (index == arr.length)
            return -1;
        else if (arr[index] == target && arr[index+1] == target)
            return index + 1;
        else
            return findLastOccurrence(arr, target, index + 1);
    }
}
