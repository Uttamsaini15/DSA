class Solution {
    public int majorityElement(int[] arr) {
        int res=0;
        int majority=0;

        for(int n: arr){
           if(majority == 0)  res=n;
           majority += n == res?1:-1;
        }
        return res;
    }
}