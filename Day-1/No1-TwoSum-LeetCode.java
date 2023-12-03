class Solution {
    public int[] twoSum(int[] nums, int target) {
        // here we will take two variables i and j. 
        // and run loops
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    // here we will create an array to return the indexes
                    
                    return new int[] {i, j};
                }
            }
        }
        return null; 
    }
}  

// I will add more description later on.
