//variable size sliding window where k is not given just we have to find a target it contains smallest , longest subbarrays

public static int minSubArrayLen(int[] arr, int target) {
    int n = arr.length;
    int left = 0;
    int currentSum = 0;
    int minLen = Integer.MAX_VALUE;

    for (int right = 0; right < n; right++) {
        // Expand window: add new element
        currentSum += arr[right];

        // Shrink window while it's valid (sum >= target)
        while (currentSum >= target) {
            int windowLen = right - left + 1;
            minLen = Math.min(minLen, windowLen);

            // Remove leftmost element and move left pointer
            currentSum -= arr[left];
            left++;
        }
    }

    // If minLen was never updated, no valid subarray exists
    return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
}