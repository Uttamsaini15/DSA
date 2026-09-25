class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, resLen=Integer.MIN_VALUE;
        HashMap<Character, Integer> freq = new HashMap<>();

        for(int h=0; h<s.length(); h++){
            freq.put(s.charAt(h), freq.getOrDefault(s.charAt(h),0)+1);

            while(freq.get(s.charAt(h))>1){
                freq.put(s.charAt(l), freq.get(s.charAt(l))-1); 
                l++;
            }

            int len = h-l+1;
            resLen=Math.max(resLen, len);
        }
        return (resLen==Integer.MIN_VALUE)?0:resLen;
    }
}