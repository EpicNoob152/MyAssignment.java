/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 25, 2023
 * @Description: This Code tries to call the swapEnds Method.
 */
public class Example5 {
    public static void main(String[] args){
        //This code gives the name of the String and then calls, and prints the method.
        Example5 im = new Example5();
        im.swapEnds("codingbat");
        System.out.println(im.swapEnds("codingbat"));

    }
    public String swapEnds(String str) {
        //This is the method code swapEnds
        if (str.length() <= 1) {
            return str;
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);
            return last + middle + first;
        }
    }

}
