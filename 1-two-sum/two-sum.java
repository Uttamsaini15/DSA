class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        //Creating a Hash Table
        for(int i=0; i<n; i++){
            int sub = target - nums[i];
            if(map.containsKey(sub)){
                return new int[]{map.get(sub), i};
            }
            map.put(nums[i], i);
        }   
        return new int[]{}; //NO solution found
    }
}