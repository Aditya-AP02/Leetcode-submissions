import java.util.*;

class Solution {
    public static List<Integer> findMissingNumbers(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        List<Integer> missing = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                missing.add(i);
            }
        }

        return missing;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int n = 6;

        List<Integer> result = findMissingNumbers(arr, n);

        System.out.println("Missing numbers are: " + result);
    }
}