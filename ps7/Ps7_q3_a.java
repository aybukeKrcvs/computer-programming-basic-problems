
package ps7_q3_a;

public class Ps7_q3_a {

    public static void main(String[] args) {
        int[] list = {60, 38, 15, 24, 35, 26, 67, 96, 51, 18, 46, 91, 50};
        
        System.out.printf("Average grade = %.2f\n", calculateAverage(list));
        System.out.println("Number of students who got the average"
                + " or above grade: " + countAboveAverage(list));
        
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
    public static int countAboveAverage(int[] arr){
        double average = calculateAverage(arr);
        int count = 0;
        for (int i = 0;i < arr.length;i++)
            if (arr[i] >= average)
                count++;
        return count;
    }
}
