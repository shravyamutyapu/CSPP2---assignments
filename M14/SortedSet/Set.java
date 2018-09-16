import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : Shravya Mutyapu.
 */
public class Set {
    //your code goes here...
    //Good luck :-)

    //properties

    /**
     * set declaration.
     */
    private int[] array;

    /**
     * size of the set.
     */
    private int size;

    public Set() {
        array = new int[10];
        size = 0;
    }


    public int get(int index) {
        if (index >= 0 && index < size()) {
            return array[index];
        }
        return -1;
    }

    public void sizeinc() {
        size++;
    }


    public int size() {
        return size;
    }

    /**
     * checks if element in set or not.
     *
     * @param      item  The item to be checked.
     *
     * @return     true if present else false.
     */
    public boolean contains(final int item) {
        // for (int i = 0; i < size; i++) {
        //     if (array[i] == item) {
        //         return true;
        //     }
        // }
        return indexOf(item)!=-1;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = get(i);
        }
        return Arrays.toString(temp).replace("[", "{").replace("]", "}");
    }

    /**
     * resizes the set or increse the memory of set.
     */
    public int indexOf(int item){
        for(int i=0;i<size;i++){
            if(array[i]==item){
                return i;
            }
        }
        return -1;
    }
    public void resize() {
        // final int factor = 2;
        // int[] newarr = new int[factor * size];
        // for (int i = 0; i < size; i++) {
        //     newarr[i] = array[i];
        // }

        // array = newarr;
        array = Arrays.copyOf(array, 2 * size);

    }

    public void add(final int item) {
        if (size == array.length) {
            resize();
        }
        if (!contains(item)) {
            array[size++] = item;
        }
    }

    /**
     * add elements to set if not present.
     *
     * @param      items  The items of int array.
     */
    public void add(final int[] items) {
        for (int i : items) {
            if (!contains(i)) {
                add(i);
            }
        }
    }

    public void arraysetter(int item, int index) {
        array[index] = item;
    }

    // public int len = array.length();
    public int getarraylength() {
        return array.length;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, size);
    }





    /**
     * intersection of to sets.
     *
     * @param      other  The Set other
     *
     * @return     intersection of two set elements
     * in an another set.
     */
    public Set intersection(final Set other) {
        Set intersectionset = new Set();

        for (int i : array) {
            if (other.contains(i)) {
                intersectionset.add(i);
            }
        }

        return intersectionset;
    }

    /**
     * retain all from the items given.
     *
     * @param items int type elements array.
     *
     * @return Set with retained elements.
     */
    public Set retainAll(final int[] items) {
        Set retainset = new Set();

        for (int i : array) {
            for (int j : items) {
                if (i == j) {
                    retainset.add(i);
                }
            }
        }

        return retainset;
    }

    /**
     * cartesian product.
     *
     * @param      obj   The Set object
     *
     * @return     cartesian product of two sets.
     */
    public int[][] cartesianProduct(final Set obj) {
        int cpsize = size() * obj.size();
        int n = 0;
        int[][] result = new int[cpsize][2];
        int k = 0;
        for (int i = 0; i < cpsize; i++) {
            result[i][0] = array[n];
            result[i][1] = obj.array[k++];
            if (k == obj.size()) {
                k = 0;
                n++;
            }
        }

        return result;
    }

}