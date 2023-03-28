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
        Example2 im = new Example2();
        im.sumDigits(45);
        System.out.println(im.sumDigits(45));
    }
    private int sumDigits(int n) {
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
