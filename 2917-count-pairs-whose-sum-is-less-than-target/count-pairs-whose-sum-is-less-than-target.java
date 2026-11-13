class Solution {
    public int countPairs(List<Integer> nums, int target) {
      Collections.sort(nums);
      int count=0;
      int l = 0;
      int h = nums.size()-1;
      while(l<h){
        if(nums.get(l)+nums.get(h)<target){
          count+=h-l;
          l++;
        }else{
          h--;
        }
      }
      return count; 
    }
}