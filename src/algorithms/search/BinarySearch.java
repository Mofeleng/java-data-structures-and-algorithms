package algorithms.search;

import java.util.Arrays;

public class BinarySearch {
    //Binary search starts at the middle and checks if target value is >, < or = to the middle value
    //If it is > then the first half of the array is removed
    //If it is < then the left part of the array is removed
    //This is done until we land on a value that is equals to the target value
    //If there is no match we return -1
    private static int binarySearch(int[] array, int target) {
        int leftIdx = 0;
        int rightIdx = array.length - 1;

        while (target <= array[rightIdx] && target >= array[leftIdx] && leftIdx <= rightIdx) {
            //The middle index is the average between the left and right index sum i.e 0+2/2 = 1
            int middleIdx = (int)Math.round((float)(leftIdx + rightIdx)/2);
            if (array[middleIdx] == target) {
                return middleIdx;
            }
            if (target > array[middleIdx]) {
                //Target  is greater than the middle value, move left point to the middle to remove left part
                leftIdx = middleIdx;
            } else if (target < rightIdx) {
                //Target is less than the middle value, move right point to the middle to remove right part
                rightIdx = middleIdx;
            }
        }

        return -1;
    };
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};

        System.out.println(binarySearch(arr, 9));
    }
}
