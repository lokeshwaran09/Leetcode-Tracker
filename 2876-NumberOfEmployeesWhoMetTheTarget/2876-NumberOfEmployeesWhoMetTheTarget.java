// Last updated: 7/9/2026, 3:09:29 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int num : hours){
            if(num >= target) count++;
        }
        return count;
    }
}