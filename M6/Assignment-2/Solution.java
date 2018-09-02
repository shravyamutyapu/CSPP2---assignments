import java.util.Scanner;
/**
 * Write a java program to round the
 * elements of a matrix to the nearest c.
 *
 * @author :
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
    /**
     * Function to round the
     * elements of a matrix to the nearest 100.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      rows     Number of rows
     * @param      columns     Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    static int[][] rndHun(final int[][] a, final int rows, final int columns) {
     for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++){
                a[i][j] = ((a[i][j]/100)*100);

     }
 }
    // // write ypur code here
    //     final int b = 50;
    //     final int c = 100;
    //     final int d = 150;
    //     final int e = 200;
    //     final int f = 250;
    //     final int g = 300;
    //     final int h = 350;
    //     final int l = 400;
    //     final int m = 450;
    //     final int p = 500;
    //     final int q = 550;

    //     for (int i = 0; i < a[0].length; i++) {
    //         for (int j = 0; j < a.length; j++) {
    //             if (a[i][j] < b) {
    //                 a[i][j] = 0;
    //             } else if (a[i][j] >= b && a[i][j] <= c) {
    //                 a[i][j] = c;
    //             } else if (a[i][j] > c && a[i][j] <= d) {
    //                 a[i][j] = c;
    //             } else if (a[i][j] > d && a[i][j] <= e) {
    //                 a[i][j] = e;
    //             } else if (a[i][j] > e && a[i][j] <= f) {
    //                 a[i][j] = e;
    //             } else if (a[i][j] > f && a[i][j] <= g) {
    //                 a[i][j] = g;
    //             } else if (a[i][j] > g && a[i][j] <= h) {
    //                 a[i][j] = g;
    //             } else if (a[i][j] > h && a[i][j] <= l) {
    //                 a[i][j] = l;
    //             } else if (a[i][j] > l && a[i][j] <= m) {
    //                 a[i][j] = l;
    //             } else if (a[i][j] > m && a[i][j] <= p) {
    //                 a[i][j] = p;
    //             } else if (a[i][j] > p && a[i][j] <= q) {
    //                 a[i][j] = p;
    //             }
    //         }
    //     }
        return a;
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = rndHun(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}
