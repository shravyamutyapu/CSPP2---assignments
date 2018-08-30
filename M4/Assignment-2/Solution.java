import java.util.Scanner;
/**
 * @brief [brief description]
 * @details [long description]
 */
public class Solution {
     /**
    *default constructor.
    **/
    private Solution() { }
    /**Fill the main function to print
     resultant of addition of matrices**/
     /**
      * @brief [brief description]
      * @details [long description]
      * 
      * @param args [description]
      */
    public static void main(final String[] args) {
      int[][] arr1;
      int[][] arr2;
      int[][] sum;
      Scanner sc = new Scanner(System.in);
      int r1 = sc.nextInt();
      int c1 = sc.nextInt();
      arr1 = new int[r1][c1];
      for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c1; j++) {
            arr1[i][j] = sc.nextInt();
        }
      }
      int r2 = sc.nextInt();
      int c2 = sc.nextInt();
      arr2 = new int[r2][c2];
      for (int i = 0; i < r2; i++) {
        for (int j = 0; j < c2; j++) {
            arr2[i][j] = sc.nextInt();
    }
      }
      if ((r1 == r2) && (c1 == c2)) {
        sum = new int[r1][c1];
        for (int i = 0; i < r2; i++) {
        for (int j = 0; j < c2; j++) {
             sum[i][j] = arr1[i][j] + arr2[i][j]; 
}
        }

     for (int i = 0; i < r2; i++) {
        for (int j = 0; j < c2; j++) {
            System.out.print(sum[i][j]);
             if (j < c2 - 1) {
                System.out.print(" ");
}
      }
    System.out.println("");
    }
} else {
    System.out.println("not possible");
 }
}

}
