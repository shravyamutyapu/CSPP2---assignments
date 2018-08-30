import java.util.Scanner;
/** Java
    main method.
    **/
public final class Solution {
    /**
    *default constructor.
    **/
    private Solution() { }
/**
 * @brief [brief description]
 * @details [long description]
 * @param args [description]
 **/
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        System.out.println(temp);

    }
}

