
package ps10_q1_d;

public class Ps10_q1_d {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        System.out.println(productOfEvenIndex(arr, 0));
    }
    
    public static int productOfEvenIndex(int[] arr, int index) {
        if (index >= arr.length - 1)
            return 1;

        return arr[index] * productOfEvenIndex(arr, index + 2);
    }
}
