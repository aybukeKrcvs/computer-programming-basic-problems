package ps4_q2_g;

public class Ps4_q2_g {

    public static void main(String[] args) {
        
        int organism = 100;
        int hours = 0;
        do {
            organism = (int)Math.pow(organism, 3);
            hours += 5;
        } while (organism < 10000000);
        System.out.println(hours);
    }
        
}
