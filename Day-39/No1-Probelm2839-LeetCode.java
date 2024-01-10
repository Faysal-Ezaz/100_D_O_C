class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i) && s1.charAt(i) != s2.charAt((i + 2) % s1.length())) return false;
        }
        return true;
    }
}
