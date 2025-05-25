
package ps7_q2_a;

public class Ps7_q2_a {

    public static void main(String[] args) {
        int[] arr = {6, -3, 15, -24, 35, 2, 67, 9, 11, -18};
        System.out.println("maximum value of an array: " + maxValue(arr));
    }
    public static int maxValue(int[] arr){
        int max = arr[0];
        for (int i = 1;i < arr.length;i++)
            if (max < arr[i])
                max = arr[i];
        return max;
    }
}
