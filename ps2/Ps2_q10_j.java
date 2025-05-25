package ps2_q10_j;

import java.util.*;

public class Ps2_q10_j {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the watt of a light bulb: ");
        int watt = input.nextInt();
        int lifeTime = 0;

        switch (watt){
            case 15:
                lifeTime = 2000;
                break;
            case 25:
                lifeTime = 1500;
                break;
            case 40:
                lifeTime = 1500;
                break;
            case 60:
                lifeTime = 1000;
                break;
            case 75:
                lifeTime = 1000;
                break;
            case 100:
                lifeTime = 500;
                break;
            default:
                System.out.println("Invalid vlue!!");
        }
        System.out.printf("life time of a light bulb is %d in hours\n", lifeTime);
    }

}
