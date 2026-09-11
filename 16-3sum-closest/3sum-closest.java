class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int maxDiff = Integer.MAX_VALUE;
        int resSum = 0;
        for(int i=0; i<n; i++){
            int left=i+1, right=n-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                int diff = Math.abs(sum-target);
                if(diff<maxDiff){
                    maxDiff = diff;
                    resSum = sum;
                }
                if(sum==target) return sum;
                else if(sum<target){ 
                    left++;
                }    
                else right--;
            }
        }
        return resSum;
    }
}