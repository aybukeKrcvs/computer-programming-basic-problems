
package ps7_q3_i;

public class Ps7_q3_i {

    public static void main(String[] args) {
        char[] list = {'A', 'B', 'C', '1', '2', '3', '@', '#', '$', '&', '!', '*', '(', ')', '-', '_', '+', '=',
            '[', ']', '{', '}', '/', '\\', '|', ';', ':', '<', '>', '.', '?', '~', '`', '\'', '\'', '0',
            'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
            'V', 'W', 'X', 'Y', 'Z', '&'};
        
        ;
        int count = 0;
        if (isIncludePercentage(list)){
            for (int i = 0; i < list.length; i++){
                if (i % 10 == 0)
                    System.out.println();
                System.out.print(list[i] + " ");
            }
        } else{
            for (int i = list.length-1; i >= 0; i--){
                if (count % 10 == 0)
                    System.out.println();
                System.out.print(list[i] + " ");
                count++;
            }
        }
        System.out.println();
        
    }
    public static boolean isIncludePercentage(char[] list){
        boolean include = false;
        for (int i = 0; i < list.length; i++){
            if (list[i] == '%'){
                include = true;
                break;
            }
        }
        return false;
    }
}
