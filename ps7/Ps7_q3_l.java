
package ps7_q3_l;

public class Ps7_q3_l {
    static int[] evenNumbers;
    static int[] oddNumbers;
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1};
        int[] list2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1};
        
        countOddAndEven(list1, list2);
        seperateOddAndEvenNumbers(list1, list2);
        
        System.out.println("Even Numbers: ");
        displayList(evenNumbers);
        System.out.println("\n\nOdd Numbers: ");
        displayList(oddNumbers);
        System.out.println("");
        
    }
    static void countOddAndEven(int[] list1, int[] list2) {
        int countEven = 0, countOdd = 0;
        for (int num : list1){
            if (num % 2 == 0)
                countEven++;
            else if (num != -1)
                countOdd++;
        }
        for (int num : list2){
            if (num % 2 == 0)
                countEven++;
            else if (num != -1)
                countOdd++;
        }
        oddNumbers = new int[countOdd];
        evenNumbers = new int[countEven];
    }
    
    static void seperateOddAndEvenNumbers(int[] list1, int[] list2) {
        int evenIndex = 0, oddIndex = 0;
        for (int num : list1)
            if (num % 2 == 0)
                evenNumbers[evenIndex++] = num;
            else if (num != -1)
                oddNumbers[oddIndex++] = num;
        for (int num : list2)
            if (num % 2 == 0)
                evenNumbers[evenIndex++] = num;
            else if (num != -1)
                oddNumbers[oddIndex++] = num;
    }
    
    static void displayList(int[] list) {
        for (int num : list)
            System.out.print( num + " ");
    }
}
