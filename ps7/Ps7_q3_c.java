
package ps7_q3_c;

public class Ps7_q3_c {

    public static void main(String[] args) {
        int[] list = {86, 0, 15, 24, 35, 0, 20, 0, 0, 70, 46, 33, 50};
        int count = countFail(list);
        
        System.out.println(count + " students did not take the exam!");
    }
    public static int countFail(int[] list){
        int count = 0;
        for (int i = 0; i < list.length; i++)
            if (list[i] == 0)
                count++;
        return count;
    }
}
