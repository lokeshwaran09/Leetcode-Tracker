// Last updated: 9/2/2026, 8:59:17 AM
1import java.util.*;
2
3class Solution {
4    public List<Integer> majorityElement(int[] nums) {
5        int candidate1 = 0;
6        int candidate2 = 0;
7        int count1 = 0;
8        int count2 = 0;
9
10        for (int num : nums) {
11            if (num == candidate1) {
12                count1++;
13            } else if (num == candidate2) {
14                count2++;
15            } else if (count1 == 0) {
16                candidate1 = num;
17                count1 = 1;
18            } else if (count2 == 0) {
19                candidate2 = num;
20                count2 = 1;
21            } else {
22                count1--;
23                count2--;
24            }
25        }
26
27        count1 = 0;
28        count2 = 0;
29
30        for (int num : nums) {
31            if (num == candidate1) {
32                count1++;
33            } else if (num == candidate2) {
34                count2++;
35            }
36        }
37
38        List<Integer> result = new ArrayList<>();
39
40        if (count1 > nums.length / 3) {
41            result.add(candidate1);
42        }
43
44        if (count2 > nums.length / 3) {
45            result.add(candidate2);
46        }
47
48        return result;
49    }
50}