class Solution {
    int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            int left=i+1, right=n-1;
            while(left<right){
                int tripleSum = arr[i]+arr[left]+arr[right];
                if(tripleSum>=sum){
                    right--;
                }else{
                    count+=right-left;
                    left++;
                }
            }
        }
        return count;
    }
}