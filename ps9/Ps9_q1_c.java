
package ps9_q1_c;

public class Ps9_q1_c {

    public static void main(String[] args) {
        int[] list = { 14, 27, 10, 11, 45, 50, 5, 60, 66, 69, 70, 79};
        int min = list[0];
        int minIndex = 0;
        min = findMin(list, min, minIndex);
        System.out.println(min);
    }
    public static int findMin(int[] list, int min, int index){
        if (index == list.length)
            return min;
        else
            if (min > list[index])
                min = list[index];
            return findMin(list, min, index+1);
    }
}
