import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // first for loop to create passes and comapre elements with unordered ramaining array , Runs n - 1 passes
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the smallest element in remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Put smallest element at current position
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}