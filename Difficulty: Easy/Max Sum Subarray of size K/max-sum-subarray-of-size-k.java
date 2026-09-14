class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int maxSum=0;
        int l=0, h=k-1;
        int sum=0;
        for(int i=l; i<=h; i++){
            sum+=arr[i];
        }
        while(h<arr.length){
            maxSum=Math.max(maxSum,sum);
            l++; //prev low = low-1
            h++; //new high = high
            if(h==arr.length) break;
            sum -= arr[l-1];
            sum+=arr[h];
        }
        return maxSum;
    }
}