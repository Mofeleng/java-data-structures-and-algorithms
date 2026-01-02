package algorithms.search;

public class InterpolationSearch {
    //Improvement over binary search used for uniformly distributed data
    // Guesses where a value might be based on calculated probe results
    //If probe is incorrect, search area is narrowed, and a new probe is calculated
    //Average case: O(log(log(n))
    //Worst case: O(n) [Values increase exponentially]
    private static int interpolationSearch(int[] array, int target) {
        //Pointers
        int leftIdx = 0;
        int rightIdx = array.length - 1;

        while (target >= array[leftIdx] && target <= array[rightIdx] && leftIdx <= rightIdx) {
            int probe = leftIdx + (rightIdx - leftIdx) * (target - array[leftIdx]) / (array[rightIdx] - array[leftIdx]);
            System.out.println("Probe: " + probe);
            if (array[probe] == target) {
                return probe;
            } else if (array[probe] < target) {
                leftIdx = probe + 1;
            } else {
                rightIdx = probe = -1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096};
        int index = interpolationSearch(arr, 256);
        System.out.println("Idx: " + index);
    }
}
