class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int n: nums){
            hs.add(n);
        }

        return hs.size()<nums.length;

    }
}