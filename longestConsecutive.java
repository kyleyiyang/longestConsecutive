class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==1) return 1;
        Arrays.sort(nums);
        int ans=0;
        for (int i=0;i<nums.length-1;i++) {
            int count=1;
            while (i<nums.length-1 && nums[i+1]==nums[i]+1) {
                i++;
                while (i<nums.length-1 && nums[i+1]==nums[i]) i++;
                count++;
            }
            if (ans<count) ans=count;
        }
        return ans;
    }
}
