class Solution {
    public void reverseString(char[] s) {
        int size = s.length;
        for(int i = 0, j = size - 1; i < size/2; i++){
            swap(s, i, j--);
        }
    }

    public void swap(char[] s, int i, int j){
        char t = s[i];
        s[i] = s[j];
        s[j] = t;
    }
}
