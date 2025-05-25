
package ps9_q1_d;

public class Ps9_q1_d {

    public static void main(String[] args) {
        int[] list = {2, 3, 5, 8, 10, 7};
        int  index = 0, product;
        product = productOfEvenNumbers(list, index);
        System.out.println(product);
    }
    public static int productOfEvenNumbers(int[] list,  int index){
        if (index == list.length)
            return 1;
        else
            if (index % 2 == 0)
                return list[index] * productOfEvenNumbers(list, index+1);
            else
                return 1 * productOfEvenNumbers(list, index+1);
    }
}
