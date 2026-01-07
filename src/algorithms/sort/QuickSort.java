package algorithms.sort;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] array, int startIdx, int endIdx) {
        int pivot = array[endIdx];
        int i = startIdx - 1;

        for (int j = startIdx; j <= endIdx - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;

        int temp = array[i];
        array[i] = array[endIdx];
        array[endIdx] = temp;

        return i;
    }
    private static void quickSort(int[] array, int startIdx, int endIdx) {
        if (endIdx <= startIdx) return;

        int pivot = partition(array, startIdx, endIdx);
        quickSort(array, startIdx, pivot - 1);
        quickSort(array, pivot + 1, endIdx);
    }
    public static void main(String[] args) {
        int[] unsortedArr = { 3, 5, 1, 2, 9, 8, 4, 7};
        quickSort(unsortedArr, 0, unsortedArr.length - 1);
        System.out.println(Arrays.toString(unsortedArr));

    }
}
