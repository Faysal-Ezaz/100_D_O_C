class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        
        int n1=s1.length();
        int n2=s2.length();
        int n3=s3.length();
        int n=Math.min(Math.min(n1,n2),n3); 
        int ans=0; int idx=0;
        for(int i=0;i<n;i++)
        {
            if(i==0){
                if((s1.charAt(i)!=s2.charAt(i)) || (s2.charAt(i)!=s3.charAt(i)) || (s1.charAt(i)!=s3.charAt(i))){
                    return -1;
                }
            }
            else
            {
                if((s1.charAt(i)!=s2.charAt(i)) || (s2.charAt(i)!=s3.charAt(i)) || (s1.charAt(i)!=s3.charAt(i))){
                    idx=i;
                    break;
                }
               
            }
        }
        if(idx==0) idx=n;
        ans=ans+(n1-idx)+(n2-idx)+(n3-idx);
        
        return ans;
    }
}
