class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max_area=0;
        float max_d=0;
        for(int i=0;i<dimensions.length;i++)
        {
            int l= dimensions[i][0];
            int b= dimensions[i][1];
            float len_d =(float)Math.sqrt((l*l)+(b*b));
            if(max_d<len_d)
            {
                max_d=len_d;
                max_area=l*b;
            }
            if(max_d==len_d)
            {
                if(max_area<l*b)
                    max_area=l*b;
            }
        
            
        }
        return max_area;
        
    }
}
