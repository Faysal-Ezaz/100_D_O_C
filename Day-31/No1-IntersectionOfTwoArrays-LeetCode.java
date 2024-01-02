class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[1001];
        int count = 0;
        for(int i = 0; i < nums1.length; i++) {
            temp[nums1[i]] = 1;
        }
        for(int i = 0; i < nums2.length; i++) {
            if(temp[nums2[i]] == 1) {
                temp[nums2[i]] = 2;
                count++;
            }
        }
        int[] ans = new int[count];
        for(int i = 0, j = 0; i < temp.length && j < count; i++) {
            if(temp[i] == 2) {
                ans[j] = i;
                j++;
            }
        }

        return ans;
    }
}
