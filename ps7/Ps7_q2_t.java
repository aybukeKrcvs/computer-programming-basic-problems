
package ps7_q2_t;

public class Ps7_q2_t {

    public static void main(String[] args) {
        int[] numbers = {6, -3, 15, -24, 35, 2, 67, 9, 11, -18};
        display(numbers);
    }
    public static void display(int[] numbers){
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }
}
