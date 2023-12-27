class Solution {
    public boolean isSubsequence(String s, String t) {
        int c=0;
        for(int i=0;i<t.length();i++){
            if(c==s.length()){
                break;
            }
            if(t.charAt(i)==s.charAt(c)){
                c++;
            }
        }
        if(c==s.length())
        return true;
        else
        return false;
    }
}
