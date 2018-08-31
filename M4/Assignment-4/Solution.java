/**Given an String, Write a java.
 method
 that returns the decimal value for the
  given binary string.
  **/
import java.util.Scanner;
/**.
 Class starts here.
**/
public final class Solution {
/**.
    Do not modify the main function
    **/
    private Solution() { }
    /**.
     * @brief [brief description]
     * @details [long description]
     * @param args [description]
     **/
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    /**.
     * @brief [brief description]
     * @details [long description]
     * @param s [description]
     * @return [string]
     */
    public static String reverseString(final String s) {
            String revers = "";
            // char[] s1=s.toCharArray();
            for (int i = s.length() - 1; i >= 0; i--) {
            revers = revers + s.charAt(i);
            }
        return revers;
    }
}
