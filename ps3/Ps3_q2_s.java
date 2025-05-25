
package ps3_q2_s;
import java.util.*;
public class Ps3_q2_s {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int NUMBER_OF_JUDGES = 10;
        double max = Double.MIN_VALUE, min = Double.MAX_VALUE, totalScore = 0;
        
        System.out.print("Enter 10 scores: ");
        
        for (int i = 0; i < NUMBER_OF_JUDGES; i++) {
            double score = input.nextDouble();
            totalScore += score;
            
            if (score >= max)
                max = score;
            if (score < min)
                min = score;
            
        }
        input.close();
        totalScore -= (max + min);
        double average = totalScore / (NUMBER_OF_JUDGES - 2);
        System.out.printf("average is %.2f\n",average);
    }
    
}
