class Solution {
    public String reversePrefix(String word, char ch) {
      StringBuilder result = new StringBuilder(word);
      int idx=0;
      for(int i=0; i<word.length(); i++){
        if(word.charAt(i)==ch){
          idx = i;
          break;
        }
      }
      int l=0, h=idx;
      while(l<h){
        char temp = result.charAt(l);
        result.setCharAt(l, result.charAt(h));
        result.setCharAt(h, temp);
        l++;
        h--;
      }
      return result.toString();
    }
}