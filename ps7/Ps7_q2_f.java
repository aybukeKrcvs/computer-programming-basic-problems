
package ps7_q2_f;

public class Ps7_q2_f {

    public static void main(String[] args) {
        int[] arr = {6, -3, 15, -24, 35, 2, 67, 9, 11, -18};
        int indexOfMin = minIndex(arr);
        System.out.println("index of min value of an array: " + arr[indexOfMin]);
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
