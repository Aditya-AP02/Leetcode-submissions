import java.util.Arrays;

public class ProductArray {

    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // Store product of elements to the left
        result[0] = 1;

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }

        // Multiply by product of elements to the right
        int suffixProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffixProduct;
            suffixProduct = suffixProduct * arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int[] result = productExceptSelf(arr);

        System.out.println(Arrays.toString(result));
    }
}