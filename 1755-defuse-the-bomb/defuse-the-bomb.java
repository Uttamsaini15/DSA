class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] res=new int[code.length];
        if(k==0) return res;
         int start = 1, end = k;                 // window for i = 0 when k > 0
        if (k < 0) {
            start = n - Math.abs(k);            // window for i = 0 when k < 0
            end = n - 1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) sum += code[i % n];

        for (int i = 0; i < n; i++) {
            res[i] = sum;
            sum -= code[start % n];             // remove left element
            start++;
            end++;
            sum += code[end % n];               // add new right element
        }
        return res;
    }
}