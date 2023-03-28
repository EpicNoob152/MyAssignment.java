/**
 * Class: Exercise 2
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 25, 2023
 * @Description: This Code tries to call the powerOfTwo Method.
 */
public class Example11 {
    public static void main(String[] args){
        //This gives n a number and then the method will be called and printed
        Example11 im = new Example11();
        im.powerOfTwo(46);
        System.out.println(im.powerOfTwo(46));
    }


    public boolean powerOfTwo(int n) {
        //This is the method.
        if (n == 0) {
            return false;
        } else {
            do {
                if (n == 1) {
                    return true;
                } else if (n % 2 != 0) {
                    return false;
                }
                n /= 2;
            } while (true);
        }
    }
}
