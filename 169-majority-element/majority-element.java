class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int res=0;
        int majority=0;

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if(map.get(arr[i])>majority){
                res=arr[i];
                majority=map.get(arr[i]);
            }
        }
        return res;
    }
}