class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int l = 0;
        int r = n-1;

        for(int i=n-1; i>=0; i--){
            int lSquare = nums[l]*nums[l];
            int rSquare = nums[r]*nums[r];

            if(lSquare>rSquare){
                res[i]=lSquare;
                l++; 
            }else{
                res[i]=rSquare;
                r--;
            }
        }
        return res;
    }
}