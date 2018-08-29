
import java.util.Scanner;
/*
    Do not modify this main function.
    */
public class Solution {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        //gcd(n1,n2);
        System.out.println(gcd(n1,n2));
    }
    /*
    Need to write the gcd function and print the output.
    */
  public static int gcd(int n1, int n2) {
    /**
     * @brief [gcd method]
     * @details [long description]
     * 
     * @param  n1 [description]
     * @param  n2 [variable n2]
     **/
    if(n2 == 0){
        return n1;
    }
    else {
        return gcd(n2, n1 % n2);

    }
}
}