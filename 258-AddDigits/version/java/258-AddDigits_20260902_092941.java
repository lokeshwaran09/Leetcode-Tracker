// Last updated: 9/2/2026, 9:29:41 AM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int slow = nums[0];
4        int fast = nums[0];
5
6        do {
7            slow = nums[slow];
8            fast = nums[nums[fast]];
9        } while (slow != fast);
10
11        slow = nums[0];
12
13        while (slow != fast) {
14            slow = nums[slow];
15            fast = nums[fast];
16        }
17
18        return slow;
19    }
20}