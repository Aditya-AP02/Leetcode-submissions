class Solution {

    public int findMaxElement(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {3, 7, 12, 9, 5};

        System.out.println(sol.findMaxElement(arr));
    }
}