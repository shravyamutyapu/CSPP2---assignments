/**
   * Do
    *not
     *modify this main function.
    **/
import java.util.Scanner;

public class Solution {
    /**
    Do not modify this main function.
    **/
    public static void main(String[] args) {
        /*main
        method
            */
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /**
    Need to write the power function and print the output.
    **/
    static long power(int base, int exponent) {
        //power method
        if (exponent == 0) {
            return 1;
        }
        else if(base == 0) {
            return 0; }
        else {
            return base * power(base, exponent - 1); }
    }
}


