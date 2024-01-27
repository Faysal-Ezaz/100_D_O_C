class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);

        int[] ans = new int[nums.length];  

        int currentIndex = 0;

        for (int i = 1; i < nums.length; i += 2) {            
            ans[currentIndex++] = nums[i];
            ans[currentIndex++] = nums[i - 1];
        }

        return ans;
    }
}
