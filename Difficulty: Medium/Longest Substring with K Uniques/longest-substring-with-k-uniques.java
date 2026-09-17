class Solution {
    public int longestKSubstr(String s, int k) {
        int low=0, result=Integer.MIN_VALUE;
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int high=0; high<s.length(); high++){
            freq.put(s.charAt(high), freq.getOrDefault(s.charAt(high),0)+1);
            while(freq.size()>k){
                char leftChar = s.charAt(low);
                freq.put(leftChar, freq.get(leftChar)-1);
                if(freq.get(leftChar)==0){
                    freq.remove(leftChar);
                }
                low++;
            }
            if(freq.size()==k){
                int length=high-low+1;
                result=Math.max(result,length);
            }
        }
        return (result==Integer.MIN_VALUE)?-1:result;
    }
}