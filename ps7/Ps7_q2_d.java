
package ps7_q2_d;

public class Ps7_q2_d {

    public static void main(String[] args) {
        int[] arr = {6, -3, 15, -24, 35, 2, 67, 9, 11, -18};
        System.out.println("index of min value of an array: " + minIndex(arr));
    }
    public static int minIndex(int[] arr){
        int index = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
