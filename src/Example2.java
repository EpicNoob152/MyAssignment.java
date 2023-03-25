/**
 * Class: Exercise 2
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 25, 2023
 * @Description: This Code tries to call the sumDigits Method.
 */

public class Example2 {
    public static void main(String[] args){
        //This gives n a number and then the method will be called and printed
        int n = 45;
        sumDigits(n);
        System.out.println(sumDigits(n));
    }
    private static int sumDigits(int n) {
        //This is the method.
        if (n == 0) {
            return 0;
        } else {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }

}
