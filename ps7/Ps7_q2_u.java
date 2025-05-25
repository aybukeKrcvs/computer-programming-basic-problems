
package ps7_q2_u;

public class Ps7_q2_u {

    public static void main(String[] args) {
        int[] list1 = {3, 1, -3, 8, 0, -4, 2};
        int[] list2 = {2, 4, -1, 2, 4, 3, 0};
        
        int[] newList = combine(list1, list2);
        for (int i = 0; i < newList.length; i++) {
            System.out.print(newList[i] + " ");
        }
        System.out.println();
    }
    public static int[] combine(int[] list1, int[] list2){
        int[] newList = new int[list2.length + list1.length];
        
        for (int i = 0; i < list1.length; i++) 
            newList[i] = list1[i];
        
        for (int i = list1.length, a = 0; i < list1.length+list2.length; i++, a++) 
            newList[i] = list2[a];
        
        return newList;
    }
}
