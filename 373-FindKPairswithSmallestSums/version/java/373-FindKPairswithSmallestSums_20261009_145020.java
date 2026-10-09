// Last updated: 10/9/2026, 2:50:20 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
5        List<List<Integer>> result = new ArrayList<>();
6
7        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
8            return result;
9        }
10
11        PriorityQueue<int[]> pq = new PriorityQueue<>(
12            (a, b) -> Integer.compare(a[0] + a[1], b[0] + b[1])
13        );
14
15        for (int i = 0; i < Math.min(nums1.length, k); i++) {
16            pq.offer(new int[]{nums1[i], nums2[0], 0});
17        }
18
19        while (k > 0 && !pq.isEmpty()) {
20            int[] pair = pq.poll();
21
22            result.add(Arrays.asList(pair[0], pair[1]));
23
24            int nextIndex = pair[2] + 1;
25
26            if (nextIndex < nums2.length) {
27                pq.offer(new int[]{
28                    pair[0], nums2[nextIndex], nextIndex
29                });
30            }
31
32            k--;
33        }
34
35        return result;
36    }
37}