
package ps8_q1_b;

public class Ps8_q1_b {

    public static void main(String[] args) {
        int[][] arr = new int[10][8];
        initializeArray(arr);
        printArr(arr);
        System.out.println("");
        printColumnwise(arr);
    }
    
    public static void initializeArray(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = 1 + (int) (Math.random() * 9);
            }
        }
    }
    
    public static void printColumnwise(int[][] arr) {
        for(int c = 0;c < arr[c].length;c++) {
            for(int r = 0;r < arr.length;r++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println("");
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
