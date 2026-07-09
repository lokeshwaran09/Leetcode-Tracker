// Last updated: 7/9/2026, 3:09:54 PM
class Solution {
    public int arraySign(int[] nums) {
        int neg = 0;
        for(int n : nums){
            if(n == 0) return 0;
            if(n < 0) neg++;
        }
        return (neg %2 == 0)? 1: -1;
    }
}