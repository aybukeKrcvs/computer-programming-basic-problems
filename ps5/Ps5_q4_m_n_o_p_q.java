
package ps5_q4_m_n_o_p_q;

public class Ps5_q4_m_n_o_p_q {

    public static void main(String[] args) {
        int number = 357;
        System.out.printf("sum of digits of %d is %d\n", number, sumOfDigits(number));
        System.out.printf("product of digits of %d is %d\n", number, productOfDigits(number));
        System.out.printf("number of digit of %d is %d\n", number, countDigits(number));
    }
    
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
    public static int productOfDigits(int number) {
        int product= 1;
        while (number > 0) {
            int digit = number % 10;
            product *= digit;
            number /= 10;
        }
        return product;
    }
    public static int countDigits(int number) {
        String numberStr = Integer.toString(number);
        int length = numberStr.length();
        return length;
    }
}
