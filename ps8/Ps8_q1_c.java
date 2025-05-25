
package ps8_q1_c;

public class Ps8_q1_c {

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        initializeArray(arr);
        initializeDiagonal(arr);
        printArr(arr);
    }
    
    public static void initializeArray(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = 1 + (int) (Math.random() * 9);
            }
        }
    }
    
    public static void initializeDiagonal(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            arr[r][r] = 0;
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
