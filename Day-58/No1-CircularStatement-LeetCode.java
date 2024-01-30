class Solution {
    public boolean isCircularSentence(String s) {
        String[] a = s.split("\\s+");
        int n = a.length;
        if(n==1)
        {
            int h = a[0].length();
            if(a[0].charAt(0)==a[0].charAt(h-1))
                return true;
            else
                return false;
        }
        for(int i=0;i<n-1;i++)
        {
            int h = a[i].length();
            if(a[i].charAt(h-1)!=a[i+1].charAt(0))
                return false;
        }
        int j = a[n-1].length();
        if(a[0].charAt(0) != a[n-1].charAt(j-1))
            return false;
        return true;
    }
}
