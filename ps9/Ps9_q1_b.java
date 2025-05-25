package ps9_q1_b;
import java.util.Scanner;
public class Ps9_q1_b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}};
        int row = input.nextInt(); 
        int column = 0;
        int sum = sumOfRow(matrix, row, column);
        System.out.println(sum);
    }
    public static int sumOfRow(int[][] matrix, int row, int column){
        if (column == matrix[row].length)
            return 0;
        else
            return matrix[row][column] + sumOfRow(matrix, row, column+1);
    }
}
