// Last updated: 7/9/2026, 3:10:45 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n-1))==0;
    }
}