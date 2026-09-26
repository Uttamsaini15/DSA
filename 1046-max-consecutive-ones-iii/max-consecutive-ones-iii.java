class Solution {
    public int longestOnes(int[] nums, int k) {
        int[] arr = new int[2];
        int maxLen=0, l=0;
        for(int h=0; h<nums.length; h++){
            if(nums[h]==0) arr[0]++;
            else arr[1]++;

            if(arr[0]>k){
                arr[nums[l]]--;
                l++;
            }

            maxLen=Math.max(maxLen, h-l+1);
        }
        return maxLen;
    }
}