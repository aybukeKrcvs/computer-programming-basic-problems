package ps7_q3_m;

import java.util.Arrays;

public class Ps7_q3_m {
    static int[] positiveNumbers;
    static int[] negativeNumbers;
    static int countZero = 0;
    public static void main(String[] args) {
        int[] numbers = {12, -5, 8, -17, 25, -30, 40, 0, 6, -9,
            15, -20, 10, 0, 28, -7, 42, 0, 18, -22,
            33, 0, 45, -11, 9, -2, 4, -6, 7, 13,
            16, -19, 21, 23, 0, -31, 36, 0, 48, -16,
            14, -10, 19, -27, 0, -37, 44, -12, 11, -8,
            3, -1, 2, -4, 5, 0, 20, -25, 0, -18,
            34, -39, 46, 0, 27, -33, 38, 45, 49, -28,
            30, -42, 47, -26, 0, -36, 43, -21, 40, -50,
            51, 0, 53, -54, 55, -56, 57, 0, 59, -60,
            61, 0, 63, -64, 65, 0, 67, -68, 69, 0,
            71, 0, 73, 0, 75, -76, 77, -78, 79, -80
        };
        countAll(numbers);
        seperatePositiveAndNegative(numbers);
        System.out.println("List of positive numbers:");
        System.out.println(Arrays.toString(positiveNumbers));
        System.out.println("\nList of negative numbers:");
        System.out.println(Arrays.toString(negativeNumbers));
        
        System.out.println("\nSum of the negative numbers: " + calculateSum(negativeNumbers));
        System.out.printf("Average of the positive numbers: %.2f\n", calculateAverage(positiveNumbers));
        
        System.out.println("\nNumber of zeros: " + countZero);
        System.out.println("Maximum negative number: " + findMax(negativeNumbers));
        System.out.println("Minimum positive number: " + findMin(positiveNumbers));
        
    }
    
    static int findMin(int[] list) {
        int min = list[0];
        for (int num : list)
            if (num < min)
                min = num;
        return min;
    }
    static int findMax(int[] list) {
        int max = list[0];
        for (int num : list)
            if (num > max)
                max = num;
        return max;
    }
    
    static int calculateSum(int[] list){
        int sum = 0;
        for (int num : list)
            sum += num;
        return sum;
    }
    
    static double calculateAverage(int[] list) {
        int sum = calculateSum(list);
        double average = (double)sum / list.length;
        return average;
    }
    
    static void countAll(int[] list) {
        int countPos = 0, countNeg = 0;
        for (int num : list){
            if (num > 0)
                countPos++;
            else if (num != 0)
                countNeg++;
            else 
                countZero++;
        }
        positiveNumbers = new int[countPos];
        negativeNumbers = new int[countNeg];
    }
    
    static void seperatePositiveAndNegative(int[] list) {
        int positiveIndex = 0, negativeIndex = 0;
        for (int num : list)
            if (num > 0)
                positiveNumbers[positiveIndex++] = num;
            else if (num != 0)
                negativeNumbers[negativeIndex++] = num;
    }
}