class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int MaxSum=Integer.MIN_VALUE;
        if(k==n){
            int sum=0;
            for(int point:cardPoints){
                sum+=point;
            }
            return sum;
        }
        int[] left = new int[k+1];
        int[] right = new int[k+1];

        for(int i=1; i<=k; i++){
            left[i]=left[i-1]+cardPoints[i-1];
            right[i]=right[i-1]+cardPoints[n-i];
        }

        for(int leftCount=0; leftCount<=k; leftCount++){
            int rightCount=k-leftCount;
            
            int sum=left[leftCount]+right[rightCount];

            MaxSum=Math.max(MaxSum, sum);
        }

        return MaxSum;
    }
}