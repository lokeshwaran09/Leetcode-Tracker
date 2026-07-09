// Last updated: 7/9/2026, 3:11:31 PM
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int mid = 0;
        int ans = Integer.MAX_VALUE;
        while(i <= j){
            mid = i + (j - i)/2;
            if(nums[i] <= nums[j]){
                ans = Math.min(ans,nums[i]);
                break;
            }else if(nums[mid] < nums[i]){
                ans = Math.min(ans,nums[mid]);
                j = mid - 1;
            }else{
                ans = Math.min(ans,nums[mid]);
                i = mid + 1;
            }
        }
        return ans;
    }
}