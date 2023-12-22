class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] s_arr = new int[256];
        int[] t_arr = new int[256];
        for(int i = 0; i < 256; i++){
            s_arr[i] = -1;
            t_arr[i] = -1;
        }
        int len = s.length();
        for(int i = 0; i < len; i++){
            if(s_arr[s.charAt(i)] != t_arr[t.charAt(i)]) return false;
            s_arr[s.charAt(i)] = t_arr[t.charAt(i)] = i;
        }
        return true;
    }
}
