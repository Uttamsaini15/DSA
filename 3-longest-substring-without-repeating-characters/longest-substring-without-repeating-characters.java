class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, resLen=Integer.MIN_VALUE;
        HashSet<Character> freq = new HashSet<>();

        for(int h=0; h<s.length(); h++){

            while (freq.contains(s.charAt(h))) {
                freq.remove(s.charAt(l));
                l++;
            }

            freq.add(s.charAt(h));
            int len = h-l+1;
            resLen=Math.max(resLen, len);
        }
        return (resLen==Integer.MIN_VALUE)?0:resLen;
    }
}