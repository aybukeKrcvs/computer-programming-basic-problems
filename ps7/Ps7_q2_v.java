
package ps7_q2_v;

public class Ps7_q2_v {

    public static void main(String[] args) {
        int[] list = {6, 3, 15, 24, 35, 2, 67, 9, 11, 18, 46, 91, 50};
        int[] even = separateEven(list);
        int[] odd = separateOdd(list);
        
        System.out.println("Even number list: ");
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println("\n\nOdd number list: ");
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
    }
    public static int[] separateEven(int[] list){
        int index = 0, counter = 0;
        for (int i = 0; i < list.length; i++)
            if (list[i] % 2 == 0)
                counter++;
        
        int[] even = new int[counter];
        for (int i = 0; i < list.length; i++)
            if (list[i] % 2 == 0){
                even[index] = list[i];
                index++;
            }
        return even;        
    }
    public static int[] separateOdd(int[] list){
        int index = 0, counter = 0;
        for (int i = 0; i < list.length; i++)
            if (list[i] % 2 != 0)
                counter++;
        
        int[] odd = new int[counter];
        for (int i = 0; i < list.length; i++)
            if (list[i] % 2 != 0){
                odd[index] = list[i];
                index++;
            }
        return odd;        
    }
}
