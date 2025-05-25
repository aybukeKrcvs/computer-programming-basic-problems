
package ps7_q3_e;

public class Ps7_q3_e {
    static int indexOfLowest;
    static int indexOfHighest;
    public static void main(String[] args) {
        int[] grades = {75, 88, 92, 63, 70, 81, 90, 42, 25, 10, 55, 35, 23, 8, 91, 67, 73, 87, 60, 95};
        String[] id = {"A001", "A002", "A003", "A004", "A005", "A006", "A007", "A008", "A009", "A010",
            "A011", "A012", "A013", "A014", "A015", "A016", "A017", "A018", "A019", "A020"};
        
        System.out.printf("Average of the grades: %.2f\n", calculateAverage(grades));
        System.out.printf("Standard deviation of the exam: %.2f\n", calculateStandardDeviation(grades));
        
        findLowestAndHighestGrade(grades);
        System.out.println("\nPerson who got the highest grade: " + id[indexOfHighest]);
        System.out.println("Person who got the lowest grade: " + id[indexOfLowest]);
        
    }
    
    public static void findLowestAndHighestGrade(int[] grades) {
        int lowest = grades[0], indexLow = 0, highest = grades[0], indexHigh = 0;
        for (int i = 1;i < grades.length;i++){
            if (grades[i] > highest){
                highest = grades[i];
                indexHigh = i;
            }
            else if (grades[i] < lowest){
                lowest = grades[i];
                indexLow = i;
            }
        }
        indexOfLowest = indexLow;
        indexOfHighest = indexHigh;
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
    
    public static double calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        double average = (double)sum / arr.length;
        return average;
    }
}
