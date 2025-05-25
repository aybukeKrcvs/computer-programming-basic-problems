
package ps10_q1_j;

public class Ps10_q1_j {

    public static void main(String[] args) {
        String str = "ALI AKIN   ";
        System.out.println(nonBlankPosition(str, 0, 0));
    }
    
    public static int nonBlankPosition(String str, int index, int current) {
        if (current == str.length())
            return index;
        if (str.charAt(current) != ' ')
            index = current;
        return nonBlankPosition(str, index, current + 1);
    }
}
