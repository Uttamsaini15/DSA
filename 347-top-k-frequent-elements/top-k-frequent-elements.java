class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>(); //element, freq.
        for(int n : nums){
            count.put(n, count.getOrDefault(n, 0)+1);
        }
        List<Integer> key = new ArrayList<>(count.keySet());
        key.sort((a,b)->count.get(b)-count.get(a)); //highest freq. first

        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i]=key.get(i);
        }
        return res; 
    }
}