import java.util.Arrays;

class Solution {
    public static int[] reverseArr(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 21, 1, 16};
        System.out.println("Reversed array is: " + Arrays.toString(reverseArr(arr)));
    }
}