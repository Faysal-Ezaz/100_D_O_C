// Main solution: 
// Solution class
class Solution {
  public int removeElements(int[] nums, int var){
    int k = 0; 
    for(int i = 0; i < nums.length; i++){
      if(nums[i] != var){
        nums[k] = nums[i]; 
        k++;
      }
    }
    return k; // returns the main value. 
  }
} 


// The judge will test your solution with the following code:

// int[] nums = [...]; // Input array
// int val = ...; // Value to remove
// int[] expectedNums = [...]; // The expected answer with correct length.
//                             // It is sorted with no values equaling val.

// int k = removeElement(nums, val); // Calls your implementation

// assert k == expectedNums.length;
// sort(nums, 0, k); // Sort the first k elements of nums
// for (int i = 0; i < actualLength; i++) {
//     assert nums[i] == expectedNums[i];
// }
