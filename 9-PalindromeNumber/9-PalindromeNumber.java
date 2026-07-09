// Last updated: 7/9/2026, 3:14:12 PM
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int rev=0;
        int original=x;
        while(x!=0){
            rev=rev*10+x%10;
            x/=10;
        }
        if(original==rev){
            return true;
        }else{
            return false;
        }
    }
}