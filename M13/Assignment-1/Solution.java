import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : Shravya Mutyapu
 */
class Set {
    //your code goes here...
    //Good luck :-)
    int[] list = new int[10];
    int size = 0;

    public int size() {
        return size;
    }

    public boolean contains(int item) {
        return list[item] != -1;
    }

    public int indexOf(int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return i;
            }

        }
        return -1;
    }

    public String toString() {
        if (size == 0) {
            return "{}";
        }
        String res = "{";
        for (int i = 0; i < size - 1; i++) {
            res = res + list[i] + ",";
        }
        return res + list[size - 1] + "}";
    }

    public void add(int item) {

        if (size == list.length) {
            resize();
        }

        for (int i = 0; i < size; i++) {
            list[size++] = item;
        }
        Arrays.sort(list);
        removeDuplicates(list, size);

    }
    public int[] resize() {
        return Arrays.copyOf(list, 2 * list.length);
    }


    static int removeDuplicates(int arr[], int n) {
        // Return, if array is empty
        // or contains a single element
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            // If current element is not equal
            // to next element then store that
            // current element
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];

        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = arr[n - 1];

        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;
    }

    public void add(int[] items) {
        for (int items : list[i]) {
            add(item);
        }
    }

    public Set intersection(Set t, Set s) {
        Set res = "[";
        for (int i = 0; i < size - 1; i++) {
            if (s[i] == t[i])
                res = res + s[i] + ",";
        }
        return res + list[size - 1] + "]";

    }
    public int[][] cartesian (Set other) {
        String [] cart = new String [this.size * other.size];

        int k = 0;
        for (int i : this.data) {
            for (int j : other.data) {
                cart[k++] = "(" + i + "," + j + ")";
            }
        }

        return Arrays.toString(cart);
    }


}
/**
 * Solution class for code-eval.
 */

public final class Solution {
    /**
     * Constructs the object.
     */


    private Solution() {
    }

    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
               .mapToInt(Integer::parseInt)
               .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        Set t = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "size": {
                System.out.println(s.size());
                break;
            }
            case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
            case "print":
                System.out.println(s);
                break;
            case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
            case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
            case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
            case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
            default:
                break;
            }
        }
    }
}

