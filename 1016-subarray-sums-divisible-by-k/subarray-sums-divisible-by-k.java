class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] map = new int[k+1]; //using array bcz if we do %k result wil never exceed k
        int sum=0, res=0;
        map[0]=1; // To handle subarrays that start from the beginning
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            int rem = sum%k;
            if(rem<0) rem+=k; //handle negative edge cases
            res+=map[rem];
            map[rem]++;
        }
        return res;
    }
}