class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int count=0, countOdd=0;
        int l=0, h=0;
        while(h<n){
            if(nums[h]%2==1) countOdd++;

            while(l<=h && countOdd==k){
                int j=h+1;

                while(j<n && nums[j]%2==0) j++;  //scan even number after the current window, bcz those even number can extend a valid subarray 

                count+=(j-h);  //j-h counts all th valid end positions 

                if(nums[l]%2==1) countOdd--;
                l++;
            }
            h++;
        }
        return count;
    }
}