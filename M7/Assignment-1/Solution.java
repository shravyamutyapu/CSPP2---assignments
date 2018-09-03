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
        /**
         * @param str1 input.
         **/
        InputValidator(final String str1) {
        str = str1;
        len = str.length();
        }
        /**
         * @return true or false.
         **/
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
     * @param args input string.
     **/
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}


