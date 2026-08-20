import java.util.Arrays;

public class Solution {

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;

        if (n == 0) {
            return;
        }

        k = k % n;

        // Reverse the entire array
        reverse(arr, 0, n - 1);

        // Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Reverse the remaining elements
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray(arr, k);

        System.out.println(Arrays.toString(arr));
    }
}