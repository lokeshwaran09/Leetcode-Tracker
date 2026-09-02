// Last updated: 9/2/2026, 8:47:41 AM
1import java.util.*;
2
3class Solution {
4    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
5        TreeSet<Long> set = new TreeSet<>();
6
7        for (int i = 0; i < nums.length; i++) {
8            long num = nums[i];
9
10            Long ceiling = set.ceiling(num - valueDiff);
11
12            if (ceiling != null && ceiling <= num + valueDiff) {
13                return true;
14            }
15
16            set.add(num);
17
18            if (i >= indexDiff) {
19                set.remove((long) nums[i - indexDiff]);
20            }
21        }
22
23        return false;
24    }
25}