package ps7_q3_d;

public class Ps7_q3_d {

    public static void main(String[] args) {

        int[] midTerm1 = {65, 20, 35, 40, 30, 55, 60, 25, 38, 43, 32, 28, 48, 39, 52, 37, 41, 47, 22, 65};
        int[] midTerm2 = {40, 90, 25, 52, 35, 20, 65, 45, 33, 18, 44, 38, 50, 23, 40, 70, 27, 49, 42, 55};
        int[] finalExam = {38, 45, 55, 80, 34, 53, 60, 20, 42, 36, 39, 50, 26, 47, 62, 29, 31, 49, 19, 45};

        String[] ids = {"A001", "A002", "A003", "A004", "A005", "A006", "A007", "A008", "A009", "A010",
            "A011", "A012", "A013", "A014", "A015", "A016", "A017", "A018", "A019", "A020"};
        
        double[] overall = weightedGrades(midTerm1, midTerm2, finalExam);
        System.out.printf("Standard deviation for midTerm1 is: %.2f\n", calculateStandardDeviation(midTerm1));
        System.out.printf("Standard deviation for midTerm2 is: %.2f\n", calculateStandardDeviation(midTerm2));
        System.out.printf("Standard deviation for finalExam is: %.2f\n", calculateStandardDeviation(finalExam));
        System.out.printf("Standard deviation for overall grades is: %.2f\n", calculateStandardDeviation(overall));
        
        whoPassedWhoFailed(ids, overall);
    }
    
    public static double[] weightedGrades(int[] mid1, int[] mid2, int[] finalE){
        double[] overallGrade = new double[mid1.length];
      
        for (int i = 0; i < mid1.length; i++){
            double overall = 0.3 * mid1[i] +
                        0.3 * mid2[i] + 
                        0.4 * finalE[i];
            overallGrade[i] = overall;
        }
        return overallGrade;
        
    }
    
    public static double calculateStandardDeviation(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        
        double average = sum / arr.length;
        double sumOfAbsSquare = 0;
        for (int i = 0;i < arr.length;i++)
            sumOfAbsSquare += Math.pow(Math.abs(average - arr[i]), 2);
        double standardDeviation = Math.sqrt(sumOfAbsSquare / arr.length);
        return standardDeviation;   
    }
    
    public static double calculateStandardDeviation(int[] arr) {
        double average = calculateSum(arr) / arr.length;
        double sumOfAbsSquare = 0;
        for (int i = 0;i < arr.length;i++)
            sumOfAbsSquare += Math.pow(Math.abs(average - arr[i]), 2);
        double standardDeviation = Math.sqrt(sumOfAbsSquare / arr.length);
        return standardDeviation;
    }
    
    public static void whoPassedWhoFailed(String[] id, double[] overall){
        System.out.println("\nList of students who passed the course: ");
        for (int i = 0; i < id.length; i++){
            if (overall[i] >= 50)
                System.out.print(id[i] + " ");
        }
        System.out.println("\n\nList of students who failed the course: ");
        for (int i = 0; i < id.length; i++){
            if (overall[i] < 50)
                System.out.print(id[i] + " ");
        }
        System.out.println();
    }
    
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
}
