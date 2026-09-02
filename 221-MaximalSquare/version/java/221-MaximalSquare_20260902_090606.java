// Last updated: 9/2/2026, 9:06:06 AM
1import java.util.*;
2
3class Solution {
4    public int[] maxSlidingWindow(int[] nums, int k) {
5        int n = nums.length;
6        int[] result = new int[n - k + 1];
7
8        Deque<Integer> deque = new ArrayDeque<>();
9        int index = 0;
10
11        for (int i = 0; i < n; i++) {
12
13            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
14                deque.pollFirst();
15            }
16
17            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
18                deque.pollLast();
19            }
20
21            deque.offerLast(i);
22
23            if (i >= k - 1) {
24                result[index++] = nums[deque.peekFirst()];
25            }
26        }
27
28        return result;
29    }
30}