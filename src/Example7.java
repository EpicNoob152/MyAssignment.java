/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 25, 2023
 * @Description: This Code tries to call the nonStart Method.
 */

public class Example7 {
    public static void main(String[] args){
        //This code assigns the name of the Strings and then calls, and prints the method.

        Example7 im = new Example7();
    im.nonStart("Hello","There");
    System.out.println( im.nonStart("Hello","There"));


    }
    public String nonStart(String a, String b) {
        //This is the nonStart Method
        if (a.length() < 2 || b.length() < 2) {
            return "";
        } else {
            return a.substring(1) + b.substring(1);
        }
    }

}
