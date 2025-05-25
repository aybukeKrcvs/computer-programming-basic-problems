
package ps7_q3_f;

public class Ps7_q3_f {

    public static void main(String[] args) {
        int[] grades = {75, 88, 92, 63, 70, 81, 90, 42, 25, 10, 55, 35, 23, 15, 91, 67, 73, 87, 60, 100};
        int[] newGradeList = excludeLowAndLarge(grades);
        double averageGrade = average(newGradeList);
        System.out.printf("average of the exam is: %.2f\n", averageGrade);
    }
    public static int[] excludeLowAndLarge(int[] grade){
        int maxIndex = 0, minIndex = 0, max = grade[0], min = grade[0];
        for (int i = 0; i < grade.length; i++){
            if(grade[i] > max){
                max = grade[i];
                maxIndex = i;
            } 
            if (grade[i] < min){
                min = grade[i];
                minIndex = i;  
            }
        }
        grade[maxIndex] = 0;
        grade[minIndex] = 0;
        return grade;
    }
    public static double average(int[] grade){
        int sum = 0;
        for (int i = 0; i < grade.length; i++)
            sum += grade[i];
        
        return (double)sum / (grade.length-2);
    }
}
