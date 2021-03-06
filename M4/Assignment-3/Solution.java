
// // Given an String, Write a java
//  method that returns the decimal
//   value for the given binary string.


import java.util.Scanner;
/**.
   Class starts here.
 **/
public final class Solution {
    /** default constructor. **/
    private Solution() { }
    /**.
     * @brief [brief description]
     * @details [long description]
     * @param args [description]
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int res = binaryToDecimal(s); //Write binaryToDecimal function
            System.out.println(res);
        }
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * @param s [description]
     * @return [description]
     */
    public static int binaryToDecimal(final String s) {
        double res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
            res = res + Math.pow(2, s.length() - 1 - i);

            }
        }
        return (int) res;

    }

}

