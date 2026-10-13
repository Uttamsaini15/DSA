class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int MaxSum=0, sum=0;
        for(int i=0; i<k; i++){
            sum+=cardPoints[i];
        }
        MaxSum=sum;
        for(int i=0; i<k; i++){
            sum+=cardPoints[n-i-1]-cardPoints[k-i-1];
            MaxSum=Math.max(sum, MaxSum);
        }
        return MaxSum;
    }
}