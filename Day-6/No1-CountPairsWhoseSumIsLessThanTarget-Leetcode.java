class Solution {
    public int countPairs(List<Integer> nums, int target) {
        // convert nums array to primitive array
        int[] arr = nums.stream().mapToInt(i->i).toArray();
        // declare counter
        int count = 0;
        // iterate with left pointer over nums
        for(int left = 0; left < nums.size(); left++) {
            // iterate with right pointer over nums
            for(int right = left + 1; right < nums.size(); right++) {
                // if sum of nums at left and right pointers less than target we increment counter
                if((arr[left] + arr[right]) < target) count++;
            }
        }
        // return counter
        return count;
    }
}
