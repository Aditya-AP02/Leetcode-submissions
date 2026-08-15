class Solution {
    public static int secondLargest(int[] arr) {
        if (arr == null || arr.length < 2) return -1;

        int largest = arr[0];
        int second = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > second) {
                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {23, 12, 7, 45, 17, 1, 26};
        System.out.println("Second largest element: " + secondLargest(arr));
    }
}