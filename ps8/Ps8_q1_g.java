
package ps8_q1_g;

public class Ps8_q1_g {

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        initializeArray(arr);
        upperTriangle(arr);
        printArr(arr);
    }
    
    public static void initializeArray(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = 1 + (int) (Math.random() * 9);
            }
        }
    }
    
    public static void upperTriangle(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = r; c < arr[r].length; c++) {
                arr[r][c] = 0;
            }
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
