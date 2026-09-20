class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int left=0, right=s.length()-1;
        boolean palindrome = true;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) palindrome=false;
            left++;
            right--;
        }
        return palindrome;
    }
}