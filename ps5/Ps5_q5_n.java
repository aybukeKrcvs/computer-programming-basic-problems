
package ps5_q5_n;

public class Ps5_q5_n {

    public static void main(String[] args) {
        int start = 100, finish = 10000000, hours;
        hours = calculateHours(start, finish);
        
        System.out.printf("Starting with %d organisms, to reach %d organisms"
                + " %d hours is needed.\n", start, finish, hours);
    }
    
    public static int calculateHours(int currentOrg, int minimumReach) {
        int hours = 0;
        while (currentOrg < minimumReach){
            currentOrg *= 2;
            hours++;
        }
        return hours;
    }
}
