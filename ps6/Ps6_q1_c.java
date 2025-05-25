
package ps6_q1_c;

public class Ps6_q1_c {

    public static void main(String[] args) {
        
        int[] id = {5010, 5020, 5030, 5040, 5050, 5060, 5070, 5080, 5090, 5100};
        String[] name = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        double[] midTerm1 = {43, 85, 12, 66, 21, 95, 56, 31, 17, 74};
        double[] midTerm2 = {70, 62, 44, 93, 88, 15, 39, 79, 68, 97};
        double[] finalExam = {50, 92, 41, 55, 29, 87, 18, 33, 64, 50};
        double[] overallGrade = new double[id.length];
        
        for (int i = 0; i < id.length; i++){
            overallGrade[i] = midTerm1[i] * 0.3 +
                            midTerm2[i] * 0.3 + 
                            finalExam[i] * 0.4;
        }
        
        System.out.println("IDs of students who passed the course: ");
        for (int i = 0; i < id.length; i++){
            if (overallGrade[i] >= 50){
                System.out.printf("ID: %d\toverall grade: %.1f\n", id[i], overallGrade[i]);
            }
        }
        
        System.out.println("\nNames of the students who failed the course:");
        for (int i = 0; i < id.length; i++){
            if (overallGrade[i] < 50){
                System.out.printf("Name: %s \toverall grade: %.1f\n", name[i], overallGrade[i]);
            }
        }
        
    }
    
}
