
package ps5_q5_s;

import java.util.Scanner;

public class Ps5_q5_s {

    public static void main(String[] args) {
        Scanner inputCh = new Scanner(System.in);
        Scanner inputLine = new Scanner(System.in);
        
        char letter;
        System.out.print("Enter a letter: ");
        while (true) {            
            letter = inputCh.next().charAt(0);
            if (isLetter(letter))
                break;
            else
                System.out.print("Invalid value, please enter again: ");
        }
        letter = Character.toLowerCase(letter);
        
        System.out.print("Enter a sentence (ending with '.'): ");
        String sentence = inputLine.nextLine();
        int countWord = 0;
        boolean isNewWord = true;
        
        for (int i = 0;i < sentence.length();i++) {
            if (isNewWord && Character.toLowerCase(sentence.charAt(i)) == letter) {
                countWord++;
                isNewWord = false;
            }
            if (!isNewWord && sentence.charAt(i) == ' ')
                isNewWord = true;
        }
        System.out.println(countWord);
    }
    
    public static boolean isLetter(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }
}
