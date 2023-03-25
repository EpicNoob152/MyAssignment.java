
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

