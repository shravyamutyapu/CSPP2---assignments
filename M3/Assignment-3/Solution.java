/**
    * @brief [brief description].

 **/
import java.util.Scanner;
/*
    Do not modify this main function.
    */
public class Solution {
    /** 
        *empty constructor.
        * **/
    protected Solution() { }
    /**
     * @brief [brief description]
     * @details [long description]
     * @param args [description]
     **/

    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        //gcd(n1,n2);
        System.out.println(gcd(n1, n2));
    }
    /*
    Need to write the gcd function and print the output.
    */
  public static int gcd(final int n1, final int n2) {
   /**
     *@param n1 [variable]
     *@param n2 [variable]
     **/
    if (n2 == 0) {
        return n1;
    } else {
        return gcd(n2, n1 % n2);

    }
}
}