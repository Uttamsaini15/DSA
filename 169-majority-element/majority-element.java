class Solution {
    public int majorityElement(int[] arr) {
        int res=0;
        int majority=0;

        for(int n: arr){
            if(majority == 0)  res=n;
            if(n==res) majority++;
            else majority--;
        }
        return res;
    }
}