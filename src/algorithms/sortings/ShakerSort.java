package algorithms.sortings;

import java.util.Arrays;

public class ShakerSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 4, 1};
        ShakerSort ss = new ShakerSort();
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Sort Ascending: " +Arrays.toString(ss.sortASC(array)));
        System.out.println("Sort Descending: " +Arrays.toString(ss.sortDESC(array)));
        System.out.print("O(n^2)");
    }

    public int[] sortASC(int[] array) {
        int buff;
        int left = 0;
        int right = array.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    buff = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buff;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    buff = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buff;
                }
            }
            left++;
        } while (left < right);

        return array;
    }

    public int[] sortDESC(int[] array) {
        int buff;
        int left = 0;
        int right = array.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] < array[i + 1]) {
                    buff = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buff;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] > array[i - 1]) {
                    buff = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buff;
                }
            }
            left++;
        } while (left < right);

        return array;
    }
}
