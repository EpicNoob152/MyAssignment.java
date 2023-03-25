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
        String str = "holiday";
        missingFront(str);
        System.out.println(missingFront(str));



    }
    public static String missingFront(String str){
        //This is the method code missingFront
        return str.substring(3);
    }
}
