class Solution {
    public int missingNumber(int[] nums) {
        boolean[] present = new boolean[nums.length+1];
        for(int value: nums){
            present[value]=true;
        } 
        for(int i=0; i<=nums.length; i++){
            if(!present[i])
                return i;
        }
        return -1;
    }
}