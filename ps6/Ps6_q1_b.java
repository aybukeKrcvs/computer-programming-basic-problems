
package ps6_q1_b;

public class Ps6_q1_b {

    public static void main(String[] args) {
        
        double[] grades = {72, 14, 96, 53, 25, 81, 10, 67, 38, 49,
                            3, 92, 60, 17, 88, 7, 44, 78, 29, 95};
        double total = 0;
        
        for (int i = 0; i < grades.length; i++)
            total += grades[i];
        
        double average = total / grades.length;
        
        if (average < 50){
            System.out.println("Grades below the average: ");
            for (int j = 0; j < grades.length; j++)
                if (grades[j] < 50)
                    System.out.print(grades[j] + " ");
        } else {
            System.out.println("Grades above the average: ");
            for (int j = 0; j < grades.length; j++)
                if (grades[j] > 50)
                    System.out.print(grades[j] + " ");
        }
        System.out.println("");
    }
    
}
