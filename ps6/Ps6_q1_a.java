
package ps6_q1_a;
import java.util.*;
public class Ps6_q1_a {

    public static void main(String[] args) {
        
        int countAvg = 0;
        double total = 0;
        double[] grades = {72, 14, 96, 53, 25, 81, 10, 67, 38, 49,
                            3, 92, 60, 17, 88, 7, 44, 78, 29, 95};
        
        for (int i = 0; i < grades.length; i++)
            total += grades[i];
        
        double average = total / grades.length;
        
        for (int i = 0; i < grades.length; i++)
            if (grades[i] == average)
                countAvg++;
        
        System.out.println(countAvg + " students got the average grade");
    }
    
}
