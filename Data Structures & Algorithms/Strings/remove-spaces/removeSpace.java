class Solution {
    public static String removeSpaces(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "H e l l o World";
        System.out.println(removeSpaces(str));
    }
}