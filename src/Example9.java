/**
 * Class: Exercise 2
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 25, 2023
 * @Description: This Code tries to call the luckySum Method.
 */
public class Example9 {
    public static void main(String[] args){
        // This gives assignments to numbers and then the method will be called and printed

        Example9 im = new Example9();
    im.luckySum(2,13,9);
    System.out.println(im.luckySum(2,13,9));


    }

    public int luckySum(int a, int b, int c) {
        int sum = 0;
        //This give certain returns if one of the inputs are 13
        if(a == 13){
            return  0;
        }
        else if(b == 13){
            return  a;
        }
        else if(c == 13){
            return a + b;
        }
        //This adds them all up if none of them are 13
        else
            return a + b + c;
    }

}
