/**
    * @brief [brief description].

 **/
import java.util.Scanner;
/**
    Do not modify this main function.
    **/
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
    /**
     * @brief [brief description]
     * @details [long description]
     * @param n1 [description]
     * @param n2 [description]
     * @return [returns integer]
     **/
  public static int gcd(final int n1, final int n2) {
    if (n2 == 0) {
        return n1;
    } else {
        return gcd(n2, n1 % n2);

    }
}
}