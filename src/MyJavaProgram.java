public class MyJavaProgram {
    public static void main(String[] args) {
        MyJavaProgram im = new MyJavaProgram();

        im.reverseDoubleChar("apple");
        System.out.println(im.reverseDoubleChar("apple"));


        im.sumDigits(45);
        System.out.println(im.sumDigits(45));


        im.birthdayName("Jaylan");
        System.out.println(im.birthdayName("Jaylan"));


        im.missingFront("hello");
        System.out.println(im.missingFront("hello"));


        im.swapEnds("codingbat");
        System.out.println(im.swapEnds("codingbat"));


        im.everyOther("hello");
        System.out.println( im.everyOther("hello"));


        im.nonStart("Hello","There");
        System.out.println( im.nonStart("Hello","There"));


        im.fibonacci(9);
        System.out.println(im.fibonacci(9));


        im.luckySum(2,13,9);
        System.out.println(im.luckySum(2,13,9));


        im.hasPalindrome("A man, a plan, a canal: Panama!");
        System.out.println( im.hasPalindrome("A man, a plan, a canal: Panama!"));


        im.powerOfTwo(46);
        System.out.println(im.powerOfTwo(46));

    }
    public String reverseDoubleChar(String word) {
        //This is the method where it doubles each character and then reverses the word.
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i) + "" + word.charAt(i);
        }
        return result;

    }

    public int sumDigits(int n) {
        //This is the method.
        if (n == 0) {
            return 0;
        } else {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }
    public String birthdayName(String name){
        //This is the method code birthdayName
        return "Happy Birthday " + name + "!";
    }
    public String missingFront(String str){
        //This is the method code missingFront
        return str.substring(3);
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
    public String everyOther(String str) {
        //This is the method code missingFront
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }
    public String nonStart(String a, String b) {
        //This is the nonStart Method
        if (a.length() < 2 || b.length() < 2) {
            return "";
        } else {
            return a.substring(1) + b.substring(1);
        }
    }
    public int fibonacci(int n) {
        //This is the method fibonacci
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative.");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
            //This is to calculate the number if it's not 0 or 1
        } else {
            int a = 0;
            int b = 1;
            for (int i = 2; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
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
    public boolean hasPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for (int i = 0; i < str.length(); i++) {
            // check for odd-length palindromes
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
            // check for even-length palindromes
            left = i;
            right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
        }
        return false;
    }
    public boolean powerOfTwo(int n) {
        //This is the method.
        if (n == 0) {
            return false;
        } else {
            do {
                if (n == 1) {
                    return true;
                } else if (n % 2 != 0) {
                    return false;
                }
                n /= 2;
            } while (true);
        }
    }
}

