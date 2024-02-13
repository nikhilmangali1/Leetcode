class Solution {
    public boolean isPallindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        return rev.equals(s);
    }
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(isPallindrome(s)){
                return s;
            }
        }
        return "";
    }
}