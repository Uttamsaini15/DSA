class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=0, currCount=0, l=0;
        for(int h=0; h<nums.length; h++){
           if(nums[h]==1){
            currCount++;
           }else{
            maxCount=Math.max(maxCount, currCount);
            currCount=0;
           }
        }
        return Math.max(maxCount, currCount);
    }
}