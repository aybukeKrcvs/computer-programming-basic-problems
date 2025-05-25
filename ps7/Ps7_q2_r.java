
package ps7_q2_r;

public class Ps7_q2_r {

    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'C', 't', 'I', 'o', 'E', 'V', 'x', 'J'};
        countLowercase(letters);
    }
    public static void countLowercase(char[] letters){
        int count = 0;
        for (int i = 0; i < letters.length; i++){
            if ('a' <= letters[i] && 'z' >= letters[i]){
                System.out.println("index of " + letters[i] + " is " + i);
                count++;
            }
        }
        System.out.println("\nThe number of uppercase letters is " + count);
    }
}
