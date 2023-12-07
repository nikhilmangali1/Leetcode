class Solution {
    public String largestOddNumber(String num) {
        if((int)num.charAt(num.length()-1)%2==1){
            return num;
        }
        int ind=num.length()-1;
        while(ind>=0){
            int n=num.charAt(ind);
            if(n%2==1){
                return num.substring(0,ind+1);
            }
            ind--;
        }
        return "";
    }
}