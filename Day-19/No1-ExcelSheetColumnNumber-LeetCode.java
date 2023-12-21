class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for(char ch : columnTitle.toCharArray()) {
            int diff = ch-('A' - 1);
            sum = sum *26 + diff;
        }
        return sum;
    }
}
