
package ps9_q1_a;

public class Ps9_q1_a {

    public static void main(String[] args) {
        
        int[][] arr = new int[6][6];
        initializeArray(arr);
        printArr(arr);
        
        System.out.println("\nproduct of the diagonal elements: " + findDiagonalProduct(arr));
    }
    
    public static void printArr(int[][] arr) {
        for(int i = 0;i < arr.length;i++) {
            for(int j = 0;j < arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void initializeArray(int[][] arr) {
        for(int i = 0;i < arr.length;i++) {
            for(int j = 0;j < arr[i].length;j++) {
                arr[i][j] = 1 + (int)(Math.random() * 9);
            }
        }
    }
    
    public static int findDiagonalProduct(int[][] arr) {
        int product = 1;
        for(int i = 0;i < arr.length;i++)
            product *= arr[i][i];
        
        return product;
    }
}
