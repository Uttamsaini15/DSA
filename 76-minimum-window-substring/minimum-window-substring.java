class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0 || t.length()==0) return "";

        int[] need = new int[128];
        int[] window = new int[128];

        for(char c:t.toCharArray()){
            need[c]++;
        }

        int count=t.length();
        int minLen=Integer.MAX_VALUE, l=0, startIdx=0;

        for(int h=0; h<s.length(); h++){
            char ch=s.charAt(h);
            window[ch]++;
            if(need[ch]>0 && window[ch]<=need[ch]){
                count--;
            }
            while(count==0){
                int len=h-l+1;
                 if (len < minLen) {
                    minLen = len;
                    startIdx = l;
                }
                window[s.charAt(l)]--;
                if(need[s.charAt(l)]>0 && window[s.charAt(l)]<need[s.charAt(l)]) count++;
                l++;
            }
        }

        return minLen==Integer.MAX_VALUE? "" : s.substring(startIdx, startIdx+minLen);
    }
}