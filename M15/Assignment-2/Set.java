import java.io.BufferedInputStream;
import java.util.Scanner;

public class Set {
    /**
     *set is an integer array.
     */
    private int[] set;
    /**
     * size is size of array.
     */
    private int size;
    /**
     *default constructor.
     */
    public Set() {
        final int TEN = 10;
        set = new int[TEN];
        size = 0;
    }
    /**
     *add method adds elements.
     *avoiding duplicates.
     * @param item [description]
     */
    public void add(int item) {
        if (size == set.length) {
            resize();
        }
        if (!contains(item)) {
            set[size++] = item;
        }
    }
    /**
     *resize method.
     */
    private void resize() {
        set = java.util.Arrays.copyOf(set, size * 2);
    }
    /**
     * @brief [brief description]
     * @details [long description]
     *
     * @param i [description]
     */
    public void setSize(int i) {
        size = i;
    }
    /**
     * integer array is given as input.
     * @param arr [description]
     */
    public void add(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
    }
    /**
     * add method.
     * @param int [description]
     * @param int [description]
     */
    public void add(final int index, final int item) {
        if (index < 0) {
            System.out.println("Negative Index Exception");
        } else {
            for (int i = size; i > index; i--) {
                set[i] = set[i - 1];
            }
        set[index] = item;
        size++;
        }
    }
    /**
     * intersection of 2 sets.
     * @param other [description]
     * @return [description]
     */
    public Set intersection(Set other) {
        Set result = new Set();
        for (int i = 0; i < this.size; i++) {
            if (other.contains(this.get(i))) {
                result.add(this.get(i));
            }
        }
        return result;
    }
    /**
     *retains all.
     * @param int [description]
     * @return [description]
     */
    public Set retainAll(final int[] arr) {
        Set other = new Set();
        for (int item : arr) {
            other.add(item);
        }
        return intersection(other);
    }
    /**
     * cartesian prod is calc.
     * @param Set [description]
     * @return [description]
     */
    public int[][] cartesianProduct(final Set other) {
        int [][] result = new int[this.size() * other.size()][2];
        int k = -1;
        if (this.size() == 0 || other.size() == 0) {
            return null;
        }
        for (int i = 0; i < this.size(); i++) {
            for (int j = 0; j < other.size(); j++) {
                result[++k][0] = this.get(i);
                result[k][1] = other.get(j);
            }
        }
        return result;
    }
    /**
     * @return size [description]
     */
    public int size() {
        return size;
    }
    /**
     * @param index [description]
     * @return int [description]
     */
    public int get(int index) {
        if (index < 0 || index >= this.size()) {
            return -1;
        } else {
            return set[index];
        }
    }
    public void sizeincrement() {
        this.size++;
    }

    public void setArrayElement(int index, int value) {
        this.set[index] = value;
    }

    public int getArrayLength() {
        return this.set.length;
    }
    /**
     *returns true if ele is present.
     * @param int [description]
     * @return bool [description]
     */
    public boolean contains(final int item) {
        return indexOf(item) != -1;
    }
    /**
     * returns index of item.
     * @param int [description]
     * @return int index[description]
     */
    public int indexOf(final int item) {
        for (int i = 0; i < size; i++) {
            if (set[i] == item) {
                return i;
            }
        }
        return -1;
    }
    /**
     * @return string[description]
     */
      public String toString() {
        if (this.size() == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < size - 1; i++) {
            sb.append(set[i] + ", ");
        }
        sb.append(set[size - 1] + "}");
        return sb.toString();
    }
}