package algorithms.sort;

import java.util.Arrays;

public class InsertionSort {
    /*
    Insertion sort works by picking an index(starting from 1), and comparing values to the left
    We do this while the values are > than the value at the current index, each time shifting them to the right until finding a value that is less than the value at the current index
    Then we move the value at the current index to the index+1 of that value(which should be empty)

    Average time: O(n^2)
    Decent for small data sets
    Best case: O(n)

     */
    private static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;

            while (j >= 0 && array[j] > temp) {
                array[j+1] = array[j]; //Shift to right
                j--;
            }
            array[j+1] = temp; //Fill empty position with the temp value
        }

        return array;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 3, 1, 5, 4, 2, 6, 7};
        int[] sortedArr = insertionSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
