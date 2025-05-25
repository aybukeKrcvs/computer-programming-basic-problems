
package ps8_q1_d;

public class Ps8_q1_d {

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        initializeArray(arr);
        printArr(arr);
    }
    
    public static void initializeArray(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if(c % 2 == 0)
                    arr[r][c] = 1;
                else
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
