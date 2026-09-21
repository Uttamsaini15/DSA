class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int i=0;
        for(int j=0; j<=ch.length; j++){
            if(j==ch.length || ch[j]==' '){
                int left=i;
                int right=j-1;
                while(left<right){
                    char t = ch[left];
                    ch[left] = ch[right];
                    ch[right] = t;
                    left++;
                    right--;
                }
                i=j+1;
            }
        }
        return new String(ch);
    }
}