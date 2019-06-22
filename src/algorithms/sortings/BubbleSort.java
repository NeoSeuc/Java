package algorithms.sortings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 4, 1};
        BubbleSort bs = new BubbleSort();
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Sort Ascending: " +Arrays.toString(bs.sortASC(array)));
        System.out.println("Sort Descending: " +Arrays.toString(bs.sortDESC(array)));
        System.out.print("Big O: n^2");
    }

    public int[] sortASC(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                }
            }
        }
        return array;
    }

    public int[] sortDESC(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                }
            }
        }
        return array;
    }
}
