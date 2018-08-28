/**
    * Program starts here.
**/
import java.util.Scanner;
/**
    *class starts here.
**/

final class Solution {
    /**
        * empty constructor.
    **/
    protected Solution() { }
/**
    Do not modify this function.
    *@param args are command line arguments
**/

    public static void main(final String[] args) {
/**
    *main starts here.
**/
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
    /**.
    * { function_description}
     @param a {parameter a}
     @param b {paramtere b}
     @param c {paramter c}
     **/
    public static void rootsOfQuadraticEquation(final int a, final  int b, final int c) {
        double result = ((b * b) - 4 * a * c);
        double root1 = (-b + Math.sqrt(result)) / (2 * a);
        double root2 = (-b - Math.sqrt(result)) / (2 * a);
        System.out.println(root1+ " " +root2);
    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
    
}