
package ps3_q2_o;
import java.util.Scanner;
public class Ps3_q2_o {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        final int STUDENTS = input.nextInt();
        int countFemale = 0, countMale = 0;
        
        System.out.println("Enter the gender of each student"
                    + "(M for male, F for female): ");
        
        for (int i = 0; i < STUDENTS; i++){
            char gender = input.next().charAt(0);
            
            if (gender == 'M' || gender  == 'm')
                countMale++;
            else if (gender == 'F' || gender  == 'f')
                countFemale++;
        }
        
        input.close();
        System.out.printf("the number of female students is %d\n"
        + "the number of male students is %d\n",countFemale, countMale);
    }
    
}
