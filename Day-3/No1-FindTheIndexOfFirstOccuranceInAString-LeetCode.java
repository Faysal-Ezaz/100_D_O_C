class Solution {
    public int strStr(String haystack, String needle) {
        int ans=0;
        int n=haystack.length(),m=needle.length();
        if(n<m)
        return -1;
        boolean flag=false;
        for(int i=0;i<n-m+1;i++){
            if(haystack.substring(i,i+m).equals(needle) && !flag){
                ans=i;
                flag=true;
                break;
            }
        }
        if(flag)
        return ans;
        else
        return -1;
    }
}
