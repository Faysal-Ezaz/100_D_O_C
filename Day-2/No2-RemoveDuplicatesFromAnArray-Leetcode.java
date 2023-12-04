// 

class Solution {
    public int removeDuplicates(int[] nums) {
        // Using the two pointer approach 
        // two variables i and j.
        int j = 0; 
        for(int i = 0; i < nums.length; i++){
            if(nums[j] != nums[i]){
                nums[++j] = nums[i]; 
            }
        }
        return j+1; // This will return the number of unique numbers i,e. 'k'
    }
} 


// The judge will test your solution with the following code:

// int[] nums = [...]; // Input array
// int[] expectedNums = [...]; // The expected answer with correct length

// int k = removeDuplicates(nums); // Calls your implementation

// assert k == expectedNums.length;
// for (int i = 0; i < k; i++) {
//     assert nums[i] == expectedNums[i];
// } 


