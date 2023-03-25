/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 25, 2023
 * @Description: This Code tries to call the fibonacci Method.
 */
public class Example8 {
    public static void main(String[] args){
        //This code gives the number of the integer and then calls, and prints the method.
        int n = 9;
        fibonacci(n);
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        //This is the method fibonacci
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative.");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
            //This is to calculate the number if it's not 0 or 1
        } else {
            int a = 0;
            int b = 1;
            for (int i = 2; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }

}
