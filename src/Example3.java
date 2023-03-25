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
        String n = "Jaylan";
        birthdayName(n);
        System.out.println(birthdayName(n));


    }
    public static String birthdayName(String name){
        //This is the method code birthdayName
        return "Happy Birthday " + name + "!";
    }

}
