class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for(int idx=0; idx<nums.length; idx++){
            int num = nums[idx];

            while(!dq.isEmpty() && dq.getLast()<num){
                dq.pollLast();
            }
            dq.addLast(num);

            if(idx>=k && nums[idx-k] == dq.getFirst()){
                dq.pollFirst();
            }

            if(idx>=k-1){
                res.add(dq.getFirst());
            }
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}