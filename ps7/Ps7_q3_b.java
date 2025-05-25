
package ps7_q3_b;

public class Ps7_q3_b {

    public static void main(String[] args) {
        int[] list = {86, 60, 15, 24, 35, 52, 67, 90, 11, 95, 46, 91, 50};
        double average = calculateAverage(list);
        
        if (average < 50){
            System.out.println("Grades below the average:");
            for (int i = 0;i < list.length;i++)
                if (list[i] < average)
                    System.out.printf(list[i] + " ");
        }else {
            System.out.println("Grades above the average:");
            for (int i = 0;i < list.length;i++)
                if (list[i] > average)
                    System.out.printf(list[i] + " ");
        }
        
        
        System.out.println();
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
