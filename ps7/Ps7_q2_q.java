
package ps7_q2_q;

public class Ps7_q2_q {

    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'C', 't', 'I', 'o', 'E', 'V', 'x', 'J'};
        countUppercase(letters);
    }
    public static void countUppercase(char[] letters){
        int count = 0;
        for (int i = 0; i < letters.length; i++){
            if ('A' <= letters[i] && 'Z' >= letters[i]){
                System.out.println("index of " + letters[i] + " is " + i);
                count++;
            }
        }
        System.out.println("\nThe number of uppercase letters is " + count);
    }
}
