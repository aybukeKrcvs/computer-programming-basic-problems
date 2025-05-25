
package ps8_q1_e;

import java.util.Arrays;

public class Ps8_q1_e {

    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        int[] newArr = new int[7];
        initializeArray(arr);
        intoOneDimensionalArr(arr, newArr);
        printArr(arr);
        System.out.println("");
        System.out.println(Arrays.toString(newArr));
    }
    
    public static void initializeArray(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = 1 + (int) (Math.random() * 9);
            }
        }
    }
    
    public static void intoOneDimensionalArr(int[][] arr, int[] newArr) {
        for (int r = 0; r < arr.length; r++) {
            newArr[r] = arr[r][r];
        }
    }
    
    public static void printArr(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println("");
        }
    }
}
