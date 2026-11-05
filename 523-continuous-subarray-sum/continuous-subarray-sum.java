class Solution {

    public boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        // Remainder before the array starts
        map.put(0, -1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int rem = sum % k;

            if (map.containsKey(rem)) {

                // Subarray must have at least 2 elements
                if (i - map.get(rem) >= 2) {
                    return true;
                }

            } else {

                // Keep the first occurrence
                map.put(rem, i);
            }
        }

        return false;
    }
}