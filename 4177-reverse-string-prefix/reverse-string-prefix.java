class Solution {
    public String reversePrefix(String s, int k) {
        char[] arr = s.toCharArray();
        int l=0, h=k-1;
        while(l<h){
            char temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
        return new String(arr);
    }
}