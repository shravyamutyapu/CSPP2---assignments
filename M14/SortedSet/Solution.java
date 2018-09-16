import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedInputStream;
/**
 *class declaration.
 */
class SortedSet extends Set {
    /**
     * constructor.
     */

    SortedSet() {
        super();
    }
    /**
     * @brief [brief description]
     * @details [long description]
     *
     * @param item [description]
     */
    @Override
    public void add(final int item) {
        if (this.size() == this.getarraylength() - 1) {
            resize();
        }

        if (!contains(item)) {
            this.insert(item);
        }

    }
    /**
     * @brief [brief description]
     * @details [long description]
     *
     * @param item [description]
     */
    public void insert(final int item) {
        int newIndex = 0;
        for (int i = this.size() - 1; i >= 0; i--) {
            if (this.get(i) < item) {
                newIndex = i + 1;
                break;
            }
        }

        int temp = 0;
        if (size() == 0) {
            temp = 0;
        } else {
            temp = this.get(newIndex);
        }
        for (int i = newIndex; i < size() + 1; i++) {
            int temp1 = this.get(i + 1);
            this.arraysetter(temp, i + 1);
            temp = temp1;

        }
        this.arraysetter(item, newIndex);
        this.sizeinc();
    }
    /**
     * @brief [brief description]
     * @details [long description]
     *
     * @param eachint [description]
     */
    public void addAll(final int[] eachint) {
        for (int i : eachint) {
            this.add(i);
        }
    }
    /**
     * @brief [brief description]
     * @details [long description]
     *
     * @param start [description]
     * @param end [description]
     *
     * @return int [description]
     */
    public int[] subSet(final int start, final int end) {
        if (start > end) {
            System.out.println("Invalid Arguments to Subset Exception");
            return null;
        }

        int i = 0;
        int j = 0;
        for (; i < size(); i++) {
            if (get(i) >= start) {
                break;
            }
        }

        for (j = i; j < size(); j++) {
            if (get(j) >= end) {
                break;
            }
        }

        int[] result = new int[j - i];
        for (int k = 0; i < j; i++, k++) {
            result[k] = get(i);
        }

        return result;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     *
     * @param element [description]
     * @return integer array[description]
     */
    public int[] headSet(final int element) {
        if (element <= get(0)) {
            return new int[] {};
        }

        int i = 0;
        for (; i < size(); i++) {
            if (get(i) >= element) {
                break;
            }
        }

        return Arrays.copyOf(getArray(), i);

    }
    /**
     * @brief [brief description]
     * @details [long description]
     * @return [last element]
     */
    public int last() {
        if (this.size() == 0) {
            System.out.println("Set Empty Exception");
            return get(this.size() - 1);
        }
        return get(this.size() - 1);


    }

}
/**
 * Solution class.
 */

public final class Solution {
    /**
     *default constructor.
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
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        SortedSet s = new SortedSet();
        // code to read the test cases input file
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (sc.hasNext()) {
            // read the line
            String line = sc.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "print":
                System.out.println(s);
                break;
            case "add":
                int[] intArray = intArray(tokens[1]);
                s.add(intArray[0]);
                break;
            case "addAll":
                intArray = intArray(tokens[1]);
                s.addAll(intArray);
                break;
            case "subSet":
                intArray = intArray(tokens[1]);
                int[] subsetarray = s.subSet(intArray[0], intArray[1]);
                if (subsetarray != null) {
                    System.out.println(Arrays.toString(subsetarray).
                                       replace("[", "{").replace("]", "}"));
                }
                break;
            case "headSet":
                intArray = intArray(tokens[1]);
                System.out.println(Arrays.toString(
                                       s.headSet(intArray[0])).replace(
                                       "[", "{").replace("]", "}"));
                break;
            case "last":
                System.out.println(s.last());
            default:
                break;
            }
        }
    }
}