
package ps7_q3_j;

public class Ps7_q3_j {

    public static void main(String[] args) {
        String sentence1 = "This is The First SenTence?";
        String sentence2 = "And here is the second one.";
        int upper1 = countUpperCase(sentence1);
        int lower1 = countLowerCase(sentence1);
        int upper2 = countUpperCase(sentence2);
        int lower2 = countLowerCase(sentence2);
        
        if (upper1 > lower2)
            System.out.println(sentence1);
        else if (lower1 > upper2)
            reverse(sentence1);
        else
            letterPositions(sentence1);
            
    }
    public static void letterPositions(String str) {
         for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.println("Uppercase letter at position " + (i + 1));
            } else if (Character.isLowerCase(ch)) {
                System.out.println("Lowercase letter at position " + (i + 1));
            }
        }
    }
    public static void reverse(String str){
        char ch;
        String newSentence = "";
        for (int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            newSentence = ch + newSentence;
        }
        System.out.println(newSentence);
    }
    public static int countUpperCase(String str){
        char[] ch = str.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++){
            if (Character.isUpperCase(ch[i]))
                count++;
        }
        return count;
    }
    public static int countLowerCase(String str){
        char[] ch = str.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++){
            if (Character.isLowerCase(ch[i]))
                count++;
        }
        return count;
    }
}
