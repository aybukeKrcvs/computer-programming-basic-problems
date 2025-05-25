
package ps7_q2_e;

public class Ps7_q2_e {

    public static void main(String[] args) {
        int[] arr = {6, -3, 15, -24, 35, 2, 67, 9, 11, -18};
        int indexOfMax = maxIndex(arr);
        System.out.println("maximum value of an array: " + arr[indexOfMax]);
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
