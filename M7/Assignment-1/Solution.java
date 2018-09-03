/**
 *
 */
import java.util.Scanner;
/**
 * class. 
 **/
    final class InputValidator {
        /**.
           Declaring a string.
        **/
        private String str;
        /**.
           Declaring string length
        **/
        private int len;
        InputValidator(final String str1) {
        str = str1;
        len = str.length();
        }
        public boolean validateData() {
    final int b = 6;
    if (len >= b) {
        return true;
    }
    return false;
}
}
/**
 * Final class.
 **/
final class Solution {
    /**
constructor.
     **/
    private Solution() { }
    /**
     * @param args.
     **/
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}

