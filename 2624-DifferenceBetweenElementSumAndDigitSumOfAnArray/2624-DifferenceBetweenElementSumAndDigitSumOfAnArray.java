// Last updated: 7/9/2026, 3:09:39 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        int r = 0;
        for(int n :nums){
            sum1 += n;
            int m = n;
            while(m!=0){
                sum2 += m%10;
                m /= 10;
            }
        }
        return sum1 - sum2;
    }
}