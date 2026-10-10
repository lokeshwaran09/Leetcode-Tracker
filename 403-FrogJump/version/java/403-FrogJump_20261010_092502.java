// Last updated: 10/10/2026, 9:25:02 AM
1import java.util.*;
2
3class Solution {
4    public boolean canCross(int[] stones) {
5        int n = stones.length;
6
7        if (stones[1] != 1) {
8            return false;
9        }
10
11        Map<Integer, Set<Integer>> dp = new HashMap<>();
12
13        for (int stone : stones) {
14            dp.put(stone, new HashSet<>());
15        }
16
17        dp.get(0).add(0);
18
19        for (int stone : stones) {
20            for (int jump : dp.get(stone)) {
21                for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {
22                    if (nextJump > 0) {
23                        int nextStone = stone + nextJump;
24
25                        if (dp.containsKey(nextStone)) {
26                            dp.get(nextStone).add(nextJump);
27                        }
28                    }
29                }
30            }
31        }
32
33        return !dp.get(stones[n - 1]).isEmpty();
34    }
35}