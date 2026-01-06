package algorithms.sort;

import java.util.Arrays;

public class MergeSort {
    /*
        O(n log n) time complexity
        O(n) space complexity, more than bubble, selection and insertion

        Recursively splits array and reorders then merges upwards
     */
    private static void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int leftSize = arr.length/2;
        int rightSize = arr.length - leftSize;
        int i = 0; // original array
        int l = 0; // left array
        int r = 0;

        while (l < leftSize && r < rightSize) {
            if (leftArr[l] < rightArr[r]) {
                arr[i] = leftArr[l];
                i++;
                l++;
            } else {
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }

        while (l < leftSize) {
            arr[i] = leftArr[l];
            i++;
            l++;
        }

        while (r < rightSize) {
            arr[i] = rightArr[r];
            i++;
            r++;
        }

    }
    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return; //base case

        int middle = length/2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[length - middle];

        int i = 0; //left array
        int j = 0; //right array

        for (;i<length;i++) {
            if (i < middle) {
                leftArr[i] = array[i];
            } else {
                rightArr[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(leftArr, rightArr, array);
    }
    public static void main(String[] args) {
        int[] unsortedArr = { 4, 1, 3, 9, 8, 6, 5, 7};
        mergeSort(unsortedArr);
        System.out.println(Arrays.toString(unsortedArr));
    }
}
