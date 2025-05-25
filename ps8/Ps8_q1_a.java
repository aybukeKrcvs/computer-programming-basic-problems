
package ps8_q1_a;

public class Ps8_q1_a {

    public static void main(String[] args) {

        int[][] arr = new int[6][6];
        initializeArray(arr);
        printArr(arr);

        System.out.println("\nproduct of the diagonal elements: " + findDiagonalProduct(arr));
    }

    public static void printArr(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println("");
        }
    }

    public static void initializeArray(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = 1 + (int) (Math.random() * 9);
            }
        }
    }

    public static int findDiagonalProduct(int[][] arr) {
        int product = 1;
        for (int r = 0; r < arr.length; r++) {
            product *= arr[r][r];
        }
        return product;
    }

}
