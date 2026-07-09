// Last updated: 7/9/2026, 3:10:58 PM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            n &= (n-1);
            count++;
        }
        return count;
    }
}