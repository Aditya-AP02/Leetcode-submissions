// question - “How will you find duplicate elements in an array?”
class Solution {
    public static int checkDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return arr[i];
            }
            set.add(arr[i]);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 4};
        int result = checkDuplicate(arr);

        System.out.println("Duplicate element is: " + result);
    }
}