
package ps7_q2_i;

public class Ps7_q2_i {

    public static void main(String[] args) {
        int[] arr = {6, -3, 15, -24, 35, 2, 67, 9, 11, -18};
        double standardDeviation = calculateStandardDeviation(arr);
        System.out.println("Standard deviation: " + standardDeviation);
    }
    public static double calculateStandardDeviation(int[] arr) {
        double average = calculateAverage(arr);
        double sumOfAbsSquare = 0;
        for (int i = 0;i < arr.length;i++)
            sumOfAbsSquare += Math.pow(Math.abs(average - arr[i]), 2);
        double standardDeviation = Math.sqrt(sumOfAbsSquare / arr.length);
        return standardDeviation;
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
