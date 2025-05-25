
package ps7_q2_b;

public class Ps7_q2_b {

    public static void main(String[] args) {
        int[] arr = {6, -3, 15, -24, 35, 2, 67, 9, 11, -18};
        System.out.println("minimum value of an array: " + minValue(arr));
    }
    public static int minValue(int[] arr){
        int min = arr[0];
        for (int i = 1;i < arr.length; i++)
            if (min > arr[i])
                min = arr[i];
        return min;
    }
}
