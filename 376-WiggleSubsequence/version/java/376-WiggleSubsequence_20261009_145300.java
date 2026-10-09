// Last updated: 10/9/2026, 2:53:00 PM
1class Solution {
2    public int wiggleMaxLength(int[] nums) {
3        if (nums.length < 2) {
4            return nums.length;
5        }
6
7        int up = 1;
8        int down = 1;
9
10        for (int i = 1; i < nums.length; i++) {
11            if (nums[i] > nums[i - 1]) {
12                up = down + 1;
13            } else if (nums[i] < nums[i - 1]) {
14                down = up + 1;
15            }
16        }
17
18        return Math.max(up, down);
19    }
20}