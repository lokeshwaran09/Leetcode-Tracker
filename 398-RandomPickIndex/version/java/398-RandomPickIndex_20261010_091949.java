// Last updated: 10/10/2026, 9:19:49 AM
1import java.util.*;
2
3class Solution {
4    private int[] nums;
5    private Random random;
6
7    public Solution(int[] nums) {
8        this.nums = nums;
9        this.random = new Random();
10    }
11
12    public int pick(int target) {
13        int result = -1;
14        int count = 0;
15
16        for (int i = 0; i < nums.length; i++) {
17            if (nums[i] == target) {
18                count++;
19
20                if (random.nextInt(count) == 0) {
21                    result = i;
22                }
23            }
24        }
25
26        return result;
27    }
28}
29
30/**
31 * Your Solution object will be instantiated and called as such:
32 * Solution obj = new Solution(nums);
33 * int param_1 = obj.pick(target);
34 */