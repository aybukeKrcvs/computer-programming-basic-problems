
package ps10_q1_i;

public class Ps10_q1_i {

    public static void main(String[] args) {
        String str= "daddy";
        char ch = 'd';
        System.out.println(countChar(str, ch, 0));
    }
    
    public static int countChar(String str, char ch,int index) {
        if (index == str.length())
            return 0;
        if (str.charAt(index) == ch)
            return 1 + countChar(str, ch, index + 1);
        else
            return 0 + countChar(str, ch, index + 1);
    }
}
