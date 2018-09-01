import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 * @author :
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution () {
        //not used
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param n   n value
     */
    public static void oddComposites(final int n) {
    // write your code here
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
            for (int j = 2; j < n; j++) {
                if (i % j == 0){
                 System.out.println(i);
                }
                else temp = 0;
            }
            if (temp == 1) {
                System.out.println(i);
            }
            }
        }

    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
public static void main(String[] args) {
    

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}

