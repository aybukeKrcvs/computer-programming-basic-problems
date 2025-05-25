
package ps7_q2_g;

public class Ps7_q2_g {

    public static void main(String[] args) {
        int[] arr = {6, -3, 15, -24, 35, 2, 67, 9, 11, -18};
        
        System.out.println("sum of the array's elements: " + calculateSum(arr));
    }
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
}
