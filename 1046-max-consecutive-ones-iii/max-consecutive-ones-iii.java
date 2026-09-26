class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCount=0;
        int maxLen=0, l=0;
        for(int h=0; h<nums.length; h++){
            if(nums[h]==0) zeroCount++;

            while(zeroCount>k){
                if(nums[l]==0) zeroCount--;
                l++;
            }

            maxLen=Math.max(maxLen, h-l+1);
        }
        return maxLen;
    }
}