/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 25, 2023
 * @Description: This Code tries to call the birthdayName method
 */

public class Example3 {
    public static void main(String[] args){
        //This code gives the name, calls, and prints method.
        Example3 im = new Example3();
        im.birthdayName("Jaylan");
        System.out.println(im.birthdayName("Jaylan"));


    }
    public String birthdayName(String name){
        //This is the method code birthdayName
        return "Happy Birthday " + name + "!";
    }

}
