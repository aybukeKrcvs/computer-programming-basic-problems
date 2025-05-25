package ps7_q3_h;

public class Ps7_q3_h {

    public static void main(String[] args) {
        String[] idList = {
            "A001", "A002", "A003", "A004", "A005", "A006", "A007", "A008", "A009", "A010",
            "A011", "A012", "A013", "A014", "A015", "A016", "A017", "A018", "A019", "A020",
            "A021", "A022", "A023", "A024", "A025", "A026", "A027", "A028", "A029", "A030",
            "A031", "A032", "A033", "A034", "A035", "A036", "A037", "A038", "A039", "A040",
            "A041", "A042", "A043", "A044", "A045", "A046", "A047", "A048", "A049", "A050"
        };
        double[] salary = {350.0, 320.0, 380.0, 340.0, 310.0,
            330.0, 370.0, 360.0, 300.0, 380.0,
            320.0, 310.0, 350.0, 290.0, 300.0,
            320.0, 330.0, 280.0, 340.0, 310.0,
            350.0, 320.0, 330.0, 320.0, 330.0,
            290.0, 310.0, 300.0, 270.0, 320.0,
            280.0, 290.0, 330.0, 310.0, 300.0,
            320.0, 300.0, 310.0, 290.0, 310.0,
            270.0, 340.0, 330.0, 320.0, 310.0,
            330.0, 320.0, 300.0, 310.0, 290.0};
        String[] chosenId = {
            "A003", "A005", "A008", "A010", "A011", "A016", "A018", "A021", "A024", "A025",
            "A028", "A032", "A033", "A037", "A038", "A041", "A044", "A046", "A047", "A049"
        };
        promote(idList, chosenId, salary);
        
    }
    public static void promote(String[] id, String[] chosenId, double[] salary){
        double[] increasedSalary = new double[chosenId.length];
        double[] oldSalary = new double[chosenId.length];
        
        for (int i = 0; i < chosenId.length; i++){
            for (int j = 0; j < id.length; j++){
                if (chosenId[i].equals(id[j])){
                    oldSalary[i] = salary[j];
                    double slry = salary[j] * 1.10;
                    increasedSalary[i] = slry;
                    continue;
                }
            }
        }
        
        System.out.println("***Promoted Salaries***");
        System.out.println("  ID\t Old\t New");
        System.out.println("-----------------------");
        for (int i = 0; i < chosenId.length; i++){
            System.out.printf("%-5s|\t%.1f\t%.1f\n", chosenId[i], oldSalary[i], increasedSalary[i]);
        }    
    }
}
