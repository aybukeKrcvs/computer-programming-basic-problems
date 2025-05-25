
package ps7_q2_c;

public class Ps7_q2_c {

    public static void main(String[] args) {
        int[] arr = {6, -3, 15, -24, 35, 2, 67, 9, 11, -18};
        System.out.println("index of max value of an array: " + maxIndex(arr));
    }
    public static int maxIndex(int[] arr){
        int index = 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
