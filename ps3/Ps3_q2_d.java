package ps3_q2_d;

import java.util.Scanner;

public class Ps3_q2_d {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = input.nextInt();

        double calculate = 0, total = 0;

        for (int n = 0; n <= 100; n += 2) {
            calculate = Math.pow(x, n);
            total += calculate;
            System.out.println(total);
        }
        System.out.println(total);
    }

}
