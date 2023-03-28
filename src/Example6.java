/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 25, 2023
 * @Description: This Code tries to call the everyOther Method.
 */
public class Example6 {
    public static void main(String[] args){
        //This code gives the name of the String and then calls, and prints the method.
        Example6 im = new Example6();
        im.everyOther("hello");
        System.out.println( im.everyOther("hello"));
    }
    public String everyOther(String str) {
        //This is the method code missingFront
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }

}
