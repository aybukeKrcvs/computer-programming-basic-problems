package ps10_q1_2;

public class Ps10_q1_2 {

    public static void main(String[] args) {
        int[][] arr = {{3, 8, 6, 7, 49, 15},
        {6, 78, 24, 35, 72, 19},
        {9, 63, 13, 55, 12, 4},
        {1, 5, 47, 93, 41, 23}};
        
        int sum = sumOfARow(arr, 1, 0);
        System.out.println(sum);
    }

    public static int sumOfARow(int[][] arr, int row, int current) {
        if (current == arr[row].length - 1) 
            return arr[row][current];
        return arr[row][current] + sumOfARow(arr, row, current+1);
    }

}
