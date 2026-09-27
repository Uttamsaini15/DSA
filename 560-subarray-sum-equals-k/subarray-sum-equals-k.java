class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();  //PrefixSum, Frequency
        int prefixSum=0, count=0; //count = no. of subarray possible
        map.put(0,1);   //if prefixSum=k (prefixSum-k=0);

        for(int h=0;h<nums.length;h++){
            prefixSum+=nums[h];
            int sum = prefixSum-k;
            if(map.containsKey(sum)){
                count+=map.get(sum);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }

        return count;
    }
}