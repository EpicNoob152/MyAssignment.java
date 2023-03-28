/**
 * Class: Exercise 2
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 25, 2023
 * @Description: This Code tries to call the missingFront Method.
 */
public class Example4 {
    public static void main(String[] args){
        //This code gives the name of the String and then calls, and prints the method.
        Example4 im = new Example4();
        im.missingFront("hello");
        System.out.println(im.missingFront("hello"));



    }
    public String missingFront(String str){
        //This is the method code missingFront
        return str.substring(3);
    }
}
