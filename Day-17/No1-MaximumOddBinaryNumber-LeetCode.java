class Solution {
    public String maximumOddBinaryNumber(String s) {
        // Create a StringBuilder to build the resulting string.
        StringBuilder result = new StringBuilder(s);

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (count > 1) {
                result.setCharAt(i, '1');
                count--;
            } else {
                result.setCharAt(i, '0');
            }
        }

        // Ensure there's always a '1' at the last position.
        result.setCharAt(s.length() - 1, '1');

        return result.toString();
    }
}
