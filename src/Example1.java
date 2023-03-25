/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 25, 2023
 * @Description: This Code tries to call the reverseDoubleChar Method.
 */

public class Example1 {

public static void main(String[] args){
    String word = "apple";
    reverseDoubleChar(word);
    System.out.print(reverseDoubleChar(word));

}

    public static String reverseDoubleChar(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i) + "" + word.charAt(i);
        }
        return result;

    }

}

