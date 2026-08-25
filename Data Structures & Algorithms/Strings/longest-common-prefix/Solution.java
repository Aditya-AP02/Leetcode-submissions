public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] input1 = {"flower", "flow", "flight"};
        String[] input2 = {"dog", "racecar", "car"};
        String[] input3 = {"apple", "ape", "april"};

        System.out.println("Input: [\"flower\", \"flow\", \"flight\"]");
        System.out.println("Output: \"" + sol.longestCommonPrefix(input1) + "\"");

        System.out.println("\nInput: [\"dog\", \"racecar\", \"car\"]");
        System.out.println("Output: \"" + sol.longestCommonPrefix(input2) + "\"");

        System.out.println("\nInput: [\"apple\", \"ape\", \"april\"]");
        System.out.println("Output: \"" + sol.longestCommonPrefix(input3) + "\"");
    }
}