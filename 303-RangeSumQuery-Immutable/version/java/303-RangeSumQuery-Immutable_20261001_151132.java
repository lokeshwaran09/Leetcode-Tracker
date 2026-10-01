// Last updated: 10/1/2026, 3:11:32 PM
1class NumArray {
2
3    int[] prefix;
4
5    public NumArray(int[] nums) {
6        prefix = new int[nums.length + 1];
7
8        for (int i = 0; i < nums.length; i++) {
9            prefix[i + 1] = prefix[i] + nums[i];
10        }
11    }
12
13    public int sumRange(int left, int right) {
14        return prefix[right + 1] - prefix[left];
15    }
16}
17
18/**
19 * Your NumArray object will be instantiated and called as such:
20 * NumArray obj = new NumArray(nums);
21 * int param_1 = obj.sumRange(left,right);
22 */