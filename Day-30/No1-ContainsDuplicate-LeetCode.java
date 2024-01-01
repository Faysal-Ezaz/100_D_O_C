class Solution {
    public boolean containsDuplicate(int[] nums) {
        int temp;
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for (int i = 0; i<nums.length-1 ; i++){
                if(nums[i]>nums[i+1]){
                   temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1]= temp;
                    sorted = false;
                }  
                 if(nums[i]==nums[i+1]){
               return true;
               }
            }  
        }
    return false;
        }     
}
Comments (0)
