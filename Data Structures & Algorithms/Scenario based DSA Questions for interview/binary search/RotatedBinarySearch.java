public class RotatedBinarySearch {

    /**
     * Searches for target in a rotated sorted array.
     * Returns the index of target, or -1 if not found.
     * Time: O(log n), Space: O(1)
     */
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if left half is sorted
            if (nums[left] <= nums[mid]) {
                // Is target in the sorted left half?
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // Right half must be sorted
                // Is target in the sorted right half?
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    // Simple test
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index = search(arr, target);
        System.out.println("Index of " + target + " = " + index); // Expected: 4

        // Additional tests
        System.out.println("Index of 5 = " + search(arr, 5));   // Expected: 1
        System.out.println("Index of 3 = " + search(arr, 3));   // Expected: -1
    }
}