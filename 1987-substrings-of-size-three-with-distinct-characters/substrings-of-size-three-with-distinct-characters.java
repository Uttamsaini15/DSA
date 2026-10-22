class Solution {
    public int countGoodSubstrings(String s) {
        int[] freq = new int[26];
        int i = 0, j = 0, distinct = 0, count = 0;

        while (j < s.length()) {
            int idx = s.charAt(j) - 'a';
            freq[idx]++;

            if (freq[idx] == 1)
                distinct++;

            if (j - i + 1 == 3) {
                if (distinct == 3)
                    count++;

                int leftIdx = s.charAt(i) - 'a';
                freq[leftIdx]--;

                if (freq[leftIdx] == 0)
                    distinct--;

                i++;
            }

            j++;
        }

        return count;
    }
}