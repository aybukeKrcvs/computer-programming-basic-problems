
package ps7_q2_h;

public class Ps7_q2_h {

    public static void main(String[] args) {
        int[] arr = {6, -3, 15, -24, 35, 2, 67, 9, 11, -18};
        double average = calculateAverage(arr);
        System.out.println("Average of the array's elements: " + average);
    }
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
    public static double calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        double average = (double)sum / arr.length;
        return average;
    }
}
