// Last updated: 9/2/2026, 8:58:37 AM
1import java.util.*;
2
3class Solution {
4    public List<String> summaryRanges(int[] nums) {
5        List<String> result = new ArrayList<>();
6
7        int i = 0;
8
9        while (i < nums.length) {
10            int start = nums[i];
11
12            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
13                i++;
14            }
15
16            if (start == nums[i]) {
17                result.add(String.valueOf(start));
18            } else {
19                result.add(start + "->" + nums[i]);
20            }
21
22            i++;
23        }
24
25        return result;
26    }
27}