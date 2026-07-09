// Last updated: 7/9/2026, 3:10:25 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int xor= x^y;
        int count=0;
        while(xor !=0){
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }
}