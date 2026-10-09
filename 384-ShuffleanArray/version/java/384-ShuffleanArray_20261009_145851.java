// Last updated: 10/9/2026, 2:58:51 PM
1import java.util.*;
2
3class Solution {
4    private int[] original;
5    private Random random;
6
7    public Solution(int[] nums) {
8        original = nums.clone();
9        random = new Random();
10    }
11
12    public int[] reset() {
13        return original.clone();
14    }
15
16    public int[] shuffle() {
17        int[] arr = original.clone();
18
19        for (int i = arr.length - 1; i > 0; i--) {
20            int j = random.nextInt(i + 1);
21
22            int temp = arr[i];
23            arr[i] = arr[j];
24            arr[j] = temp;
25        }
26
27        return arr;
28    }
29}
30
31/**
32 * Your Solution object will be instantiated and called as such:
33 * Solution obj = new Solution(nums);
34 * int[] param_1 = obj.reset();
35 * int[] param_2 = obj.shuffle();
36 */