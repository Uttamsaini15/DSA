class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0, right = height.length-1;
        while(left<right){
            int ht = Math.min(height[left], height[right]);
            int wd = right-left;
            int currWater = ht*wd;
            maxWater= Math.max(maxWater, currWater);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return maxWater;
    }
}