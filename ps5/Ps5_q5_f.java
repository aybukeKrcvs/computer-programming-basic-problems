
package ps5_q5_f;

public class Ps5_q5_f {

    public static void main(String[] args) {
        
        double[] myArray = new double[50];
        for (int i = 0;i < myArray.length;i++)
            myArray[i] = Math.random() * 501 - 250;
        
        int negativeCount = 0, greaterThanQuarter = 0;
        for (int i = 0;i < myArray.length;i++){
            System.out.printf("%8.2f  ", myArray[i]);
            if ((i+1) % 5 == 0 && i != 0)
                System.out.println("");
            
            if (myArray[i] < 0)
                negativeCount++;
            else if (myArray[i] - (int)myArray[i] > 0.25)
                greaterThanQuarter++;
        }
        
        System.out.println("\n\nnumber of negative values: " + negativeCount +
                    "\nnumber of positive values whose fractional part is "
                            + "greater than 0.25: " + greaterThanQuarter);
    }
    
}
