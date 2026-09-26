class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] freq=new int[26];
        int maxLen=0, maxFreq=0, l=0;
        
        for(int h=0; h<n; h++){

            char ch = s.charAt(h);
            freq[ch-'A']++;
            maxFreq=Math.max(maxFreq, freq[ch-'A']);

            int rn = (h-l+1)-maxFreq;  //Replacemet Needed=WindowLength-Max-freq;

            if(rn>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }

            maxLen=Math.max(maxLen, (h-l+1));
        }
        return maxLen;
    }
}